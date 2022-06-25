package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercice207 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// fazer cadastrar
		System.out.print("Quantidade de Produtos: ");
		int quantProdutos = scan.nextInt();

		for (int i = 0; i < quantProdutos; i++) {
			System.out.print("Produto: ");
			String nomeProd = scan.next().toUpperCase();
			System.out.print("Quantidade: ");
			int quantProd = scan.nextInt();
			System.out.print("Valor: ");
			double valorProd = scan.nextDouble();
			scan.nextLine();
			arquivoDB(nomeProd, quantProd, valorProd);
		}

		// criar pasta
		// fazer arquivo csv
		// calcular o valor total

		System.out.println("FIM");
		scan.close();
	}

	// fazer arquivoDB
	static void arquivoDB(String prod, int quant, double valor) {

		String pathArquivoDB = "/home/josevan/workspace/Lab-NelioAlves/ws-java/src/extras/";
		File file = new File(pathArquivoDB);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivoDB.txt", true))) {
			bw.write(prod + "," + quant + "," + valor);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
