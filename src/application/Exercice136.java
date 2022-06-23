package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Exercice136 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter department's name: ");
		String departName = scan.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Level: ");
		String level = scan.nextLine().toUpperCase();
		
		
		
		System.out.print("Base Salary: ");
		Double baseSalary = scan.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departName)); 
				
		System.out.print("How many contracts to this worker?");
		int numContract = scan.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for(int i = 0; i < numContract; i++) {
			System.out.print("Enter contract #"+(i+1)+" data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date dateContract = sdf.parse(scan.next());
			
			System.out.print("Value per Hour: ");
			double valueHour = scan.nextDouble();
			System.out.print("Duration (hours): ");
			int durationHour = scan.nextInt();
			
			HourContract hourContract = new HourContract(dateContract, valueHour, durationHour);
			worker.addContract(hourContract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+ worker.getName());
		System.out.println("Department: "+ worker.getDepartment().getName());
		System.out.println("Salary "+ monthAndYear +": "+ String.format("%.2f", worker.income(year, month)));
		
		
		scan.close();
	}
}
