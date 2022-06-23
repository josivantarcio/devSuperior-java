package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Exercice96 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Employee> listEmployee = new ArrayList<>(); 

		System.out.print("How many employee will be registered? ");
		int numEmployee = scan.nextInt();

		for (int i = 0; i < numEmployee; i++) {
			System.out.println("Employee #" + (1+i) + ": ");
			
			System.out.print("ID: ");
			int id = scan.nextInt();
			
			System.out.print("Name: "); scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Salary: ");
			double salary = scan.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			listEmployee.add(employee);
		}
		

		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = scan.nextInt();
		
		Employee employee = listEmployee.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
		if(employee != null) {
			System.out.print("Enter the percentage: ");
			double percent = scan.nextDouble();
			employee.IncreaseSalary(percent);
		}else {
			System.err.println("This id does not exist!");
		}
		
		System.out.println("List Employee:");
		for(Employee x : listEmployee) {
			System.out.println(x);
		}
		
		scan.close();
	}
}
