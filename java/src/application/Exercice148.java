package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee2;
import entities.OutsourcedEmployee;

public class Exercice148 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = scan.nextInt();

		List<Employee2> list = new ArrayList<>();

		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scan.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee2(name, hours, valuePerHour));
			}
		}

		System.out.println("Payments:");
		for(Employee2 ep : list) {
			System.out.println("nome "+ep.getName()+" - $"+ep.Payment());
		}

		scan.close();
	}
}
