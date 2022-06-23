package application;

import java.util.Scanner;

import entities.ContaExercicio164;
import exceptions.LimitException;

public class Exercice164 {
	public static void main(String[] args) throws LimitException {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int num = scan.nextInt();
		System.out.print("Holder: ");
		String name = scan.next();
		System.out.print("initial Balance: ");
		double balanceInitial = scan.nextDouble();
		System.out.print("Withdraw Limit: ");
		Double wdLimit = scan.nextDouble();

		ContaExercicio164 conta = new ContaExercicio164(num, name, balanceInitial, wdLimit);

		System.out.println();
		System.out.print("Enter amount for withdrow: ");

		try {
			conta.withrdraw(scan.nextDouble());
			System.out.println("New balance: " + conta.getBalance());
		} catch (LimitException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro desconhecido " + e.getMessage());
		}

		scan.close();
	}

}
