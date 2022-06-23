package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula201 {

	public static void main(String[] args) {

		File file = new File("/home/josevan/workspace/Lab-NelioAlves/ws-java/java/src/extras/io.txt");
		Scanner scan = null;

		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}

		} catch (IOException e) {
			System.err.println("Erro: Arquivo não Localizado! " + e.getMessage());
		} finally {
			if (file != null) {
				scan.close();
			}
		}
	}
}
