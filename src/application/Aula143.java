package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Aula143 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Account> acc = new ArrayList<Account>();
		
		acc.add(new SavingsAccount(1000, "alex", 100.0, 0.01));
		acc.add(new BusinessAccount(1002, "arthur", 200.00, 10.0));
		acc.add(new BusinessAccount(1003, "Ivana", 200.20, 10.0));
		acc.add(new SavingsAccount(1004, "Julia", 500.00, 5.0));
		
		double sum = 0;
		for(Account a : acc) {
			sum += a.getBalance();
		}
		System.out.printf("%.2f", sum);
		System.out.println();
		
		for(Account a : acc) {
			a.deposit(20.00);
			System.out.println(a.getBalance());
		}

		for(Account a : acc) {
			sum += a.getBalance();
		}
		System.out.printf("%.2f", sum);
		
		scan.close();
	}
}
