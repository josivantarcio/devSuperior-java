package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program70c {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Nome: ");
		student.setNome(scan.nextLine());
		double[] notas = new double[3];
		  
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Notas " + (i + 1) + ": ");
			notas[i] = scan.nextDouble();
		}
		student.setNotas(notas);

		System.out.println(student.Situação());

		scan.close();
	}
}
