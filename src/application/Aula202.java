package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula202 {
	public static void main(String[] args) {

		String file = "/home/josevan/workspace/Lab-NelioAlves/ws-java/java/src/extras/io.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			
			br = new BufferedReader(new FileReader(file));

			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
