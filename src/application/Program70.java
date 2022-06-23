package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program70 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.setHeight(scan.nextDouble());
		rectangle.setWidth(scan.nextDouble());
		
		//System.out.println("\nAREA: " + rectangle.Area());
		System.out.println("PERIMETER: " + rectangle.Perimeter());
		System.out.println("DIAGONAL: " + rectangle.Diagonal());
		
		
		scan.close();
	}
}
