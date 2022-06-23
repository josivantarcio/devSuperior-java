package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula159 {

	public static void main(String[] args) {
		
		File file = new File("/home/josevan/temp/intro2.txt");
		Scanner scan = null;
		
		try {
			scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Erro no found file: " + e.getMessage());
		}
		finally {
			if(scan != null) {
				scan.close();
			}
			System.out.println("The End");
		}
	}
}
