package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula158 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			String[] nomes = scan.nextLine().split(" ");
			int x  = scan.nextInt();
			System.out.println(nomes[x]);
			}
		catch (InputMismatchException e) {
			System.err.println("Caracter Invalid");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Number out of limit");
		}
		
		System.out.println("the end");
		scan.close();
	}
}
