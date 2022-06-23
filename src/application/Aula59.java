package application;

public class Aula59 {
	public static void main(String[] args) {
/*
 * Conta quantas palabras existe no texto;
 * Mostra apenas a primeira letra de cada palavra.
 */
		String nome = "Josevan Tarcio Silva Oliveira";

		String[] breaking = nome.split(" ");
		System.out.println(breaking.length);

		for (int i = 0; i < breaking.length; i++) {
			System.out.print(breaking[i].substring(0,1));

		}
			System.out.println();
			for (String x : breaking) {
				System.out.print(x+" ");
		
		}
	}
}
