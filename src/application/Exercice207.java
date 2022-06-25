package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercice207 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String pathArquivoDB = "/home/josevan/workspace/Lab-NelioAlves/ws-java/src/extras/";
		String pathArquivoCSV = "/print/";

		System.out.print("Quantidade de Produtos: ");
		int quantProdutos = scan.nextInt();

		cadastrarProd(quantProdutos, pathArquivoDB);
		criarPasta(pathArquivoDB, pathArquivoCSV);
		arquivoCSV(pathArquivoDB, pathArquivoCSV);

		System.out.println("FIM");
		scan.close();
	}

	// fazer cadastrar
	static void cadastrarProd(int quantProdutos, String pathArquivoDB) {
		Scanner scan = new Scanner(System.in);
		String path = pathArquivoDB;

		for (int i = 0; i < quantProdutos; i++) {
			System.out.print("Produto: ");
			String nomeProd = scan.next().toUpperCase();
			System.out.print("Quantidade: ");
			int quantProd = scan.nextInt();
			System.out.print("Valor: ");
			double valorProd = scan.nextDouble();
			scan.nextLine();
			arquivoDB(nomeProd, quantProd, valorProd, path);
		}
		scan.close();
	}

	// fazer arquivoDB
	static void arquivoDB(String prod, int quant, double valor, String pathArquivoDB) {

		File file = new File(pathArquivoDB + "arquivoDB.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.write(prod + "," + quant + "," + valor);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// fazer arquivo csv
	static void arquivoCSV(String pathArquivoDB, String pathArquivoCSV) {
		File fileDestino = new File(pathArquivoDB + pathArquivoCSV + "summary.csv");
		String pthOrigem = pathArquivoDB + "arquivoDB.txt";
		File fileOrigem = new File(pthOrigem);

		// ler os dados da pasta
		try (BufferedReader br = new BufferedReader(new FileReader(fileOrigem))) {
			// escrever e criar o arquino na pasta /OUT
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileDestino))) {

				String linha = br.readLine();

				while (linha != null) {

					// calcular o valor total
					String[] map = linha.split(",");
					Double valor = Double.valueOf(map[2]);
					Integer quantidade = Integer.valueOf(map[1]);
					Double total = valor * quantidade;

					bw.write(map[0] + " R$ " + total);
					bw.newLine();
					linha = br.readLine();
				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// criar pasta
	static boolean criarPasta(String pathArquivoDB, String pathArquivoCSV) {
		return new File(pathArquivoDB + pathArquivoCSV).mkdir();
	}

}
