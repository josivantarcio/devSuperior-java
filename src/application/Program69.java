package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program69 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle x:");
		x.setA(scan.nextDouble());
		x.setB(scan.nextDouble());
		x.setC(scan.nextDouble());
		
		System.out.println("Enter the measures of triangle y:");
		y.setA(scan.nextDouble());
		y.setB(scan.nextDouble());
		y.setC(scan.nextDouble());
		
		
		System.out.printf("Triangle x area: %.4f",x.calcularArea());
		System.out.printf("\nTriangle y area: %.4f",y.calcularArea());
		
		System.out.println();
		if(x.calcularArea() > y.calcularArea()) {
			System.out.println("X is larger");
		}else {
			System.out.println("Y is larger");
		}
		
		

		scan.close();
	}
}
