package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercice207 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantidade de produtos: ");
		int quantProd = scan.nextInt();

		System.out.print("Nome do Arquivo: ");
		String nomeArquivo = scan.next();

		for (int i = 0; i < quantProd; i++) {
			scan.nextLine();
			System.out.print("Digite o nome do produto: ");
			String nome = scan.nextLine();
			System.out.print("Quantidade: ");
			int q = scan.nextInt();
			System.out.print("Valor: ");
			double v = scan.nextDouble();

			// criar arquivoOrigem
			arquivoIn(nomeArquivo, nome, v, q);

			System.out.println("produto registrado...");
		}

		// gerar arquivo em outra pasta e arquivo
		System.out.print("Digite o nome da nova pasta: ");
		String pastaDestino = scan.next();
		criarPasta(pastaDestino);
		arquivoOut(pastaDestino);
		

		scan.close();
	}

	static void arquivoIn(String nomeArquivo, String n, Double v, Integer q) {
		String caminhoStatic = "/home/josevan/workspace/Lab-NelioAlves/ws-java/src/extras/";
		File file = new File(nomeArquivo);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoStatic + file, true))) {

			bw.write(n + "," + v + "," + q);
			bw.newLine();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void arquivoOut(String pastaDestino) {

		String caminhoStatic = "/home/josevan/workspace/Lab-NelioAlves/ws-java/src/extras/" + pastaDestino + "/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoStatic))) {
			String line = br.readLine();

			while (line != null) {

				line = br.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void criarPasta(String nomePasta) {
		String caminhoStatic = "/home/josevan/workspace/Lab-NelioAlves/ws-java/src/extras/";
		boolean valid = new File(caminhoStatic + nomePasta).mkdir();
	}

}
