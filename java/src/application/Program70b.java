package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program70b {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.setName(scan.nextLine());
		System.out.print("Salary: ");
		employee.setGrossSalary(scan.nextDouble());
		System.out.print("Tax: ");
		employee.setTax(scan.nextDouble());

		System.out.println("Employee: " + employee.getName() + " $ " + String.format("%.2f", employee.NetSalary()));

		System.out.print("Wich percentage to increase salary? ");
		employee.IncreaseSalary(scan.nextDouble());
		System.out.println("Updated data: " + employee.getName() + ", $ " + String.format("%.2f", employee.NetSalary()));

		scan.close();
	}
}
