package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aula204 {
	public static void main(String[] args) {

		/*
		 * Bloco Try-with-resources
		 */

		Scanner scan = new Scanner(System.in);
		String file = "/home/josevan/workspace/Lab-NelioAlves/ws-java/src/extras/ioOut.txt";

		System.out.println("Digite um texto:");
		String input = scan.nextLine();
		String[] texto = new String[] { input };

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			for (String txt : texto){
				bw.write(txt);
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (scan != null) {
				System.out.println("Finalizou!");
				scan.close();
			}
		}
	}
}
