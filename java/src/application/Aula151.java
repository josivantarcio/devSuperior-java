package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Aula151 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = scan.nextInt();
		List<Shape> shape = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Shape #"+(1+i)+" data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = scan.next().toLowerCase().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED)? ");
			Color color = Color.valueOf(scan.next().toUpperCase());
			
			if(type == 'r') {
				System.out.print("Width: ");
				double w = scan.nextDouble();
				System.out.print("Height: ");
				double h = scan.nextDouble();
				shape.add(new Rectangle(color, w, h));
								
			}else if(type == 'c') {
				System.out.print("Radius: ");
				double r = scan.nextDouble();
				shape.add(new Circle(color, r));
			}
		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape c : shape) {
			System.out.println(String.format("%.2f", c.area()));
		}
				
		scan.close();
	}
}
