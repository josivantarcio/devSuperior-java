package application;

import java.util.Scanner;

public class Exercice100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Valor de M");
		int M = scan.nextInt();

		System.out.println("Valor de N");
		int N = scan.nextInt();

		Integer[][] MN = new Integer[M][N];

		for (int i = 0; i < MN.length; i++) {
			for (int j = 0; j < MN[i].length; j++) {
				MN[i][j] = scan.nextInt();
			}
		}

		System.out.print("buscar numero: ");
		int num = scan.nextInt();

		for (int i = 0; i < MN.length; i++) {
			for (int j = 0; j < MN[i].length; j++) {
				if (num == MN[i][j]) {
					System.out.println("position:" + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + MN[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + MN[i - 1][j]);
					}
					if (j < MN[i].length - 1) {
						System.out.println("Right: " + MN[i][j + 1]);
					}
					if (i < MN.length - 1) {
						System.out.println("Down: " + MN[i + 1][j]);
					}

				}
			}
		}

		scan.close();
	}
}
