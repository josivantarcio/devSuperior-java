package application;

import java.util.Scanner;

public class Exercice99 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[][] tela = new Integer[n][n];
		int sum = 0;
		for(int i = 0; i < tela.length; i++) {
			for(int j = 0; j < tela[i].length; j++) {
				tela[i][j] = scan.nextInt();
				if(tela[i][j] < 0) {
					sum++;
				}
			}
		}
		for(int i =0; i < tela.length;i++) {
			System.out.print(tela[i][i]+" ");
			
		}
		System.out.println("\nTotal negativos: "+sum);
		
		
		
		scan.close();
	}

}
