package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula203 {
	public static void main(String[] args) {

		/*
		 * Bloco Try-with-resources
		 */

		String file = "/home/josevan/workspace/Lab-NelioAlves/ws-java/java/src/extras/io.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
