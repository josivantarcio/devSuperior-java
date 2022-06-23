package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalEntity;
import entities.Person;
import entities.PhysicalPerson;

public class Exercice152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Person> taxpayers = new ArrayList<>();

		System.out.print("Enter the number Taxpayers: ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #"+(1+i)+" data:");
			System.out.print("Person Physical or Entity (p/e)? ");
			char person = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine().toUpperCase();
			System.out.print("Annual Income: $");
			Double value = scan.nextDouble();

			if (person == 'p') {
				System.out.print("Value Health: $");
				double valueHealth = scan.nextDouble();
				taxpayers.add(new PhysicalPerson(name, value, valueHealth));
			} else if (person == 'e') {
				System.out.print("Quantity Employee:");
				int quantityEmployee = scan.nextInt();
				taxpayers.add(new LegalEntity(name, value, quantityEmployee));
			}
		}

		System.out.println("TAXES PAID:");
		double sum = 0;
		for (Person p : taxpayers) {
			sum += p.tax();
			System.out.println(p.getName()+": " + String.format("$ %.2f", p.tax()));
		}
		System.out.printf("Total: $ %.2f", sum);

		scan.close();
	}
}
