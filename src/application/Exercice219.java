package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import service.Calcution;
import service.ContractService;
import service.Paypal;

public class Exercice219 {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Calcution calc = new Paypal();

		System.out.println("Enter contract data");
		System.out.print("Number: "); 
		Integer number = sc.nextInt();

		System.out.print("Date (dd/MM/yyyy): ");
		Date dateInitial = sdf.parse(sc.next());

		System.out.print("Contract value: ");
		Double value = sc.nextDouble();

		Contract contract = new Contract(number, dateInitial, value);

		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		
		ContractService cs = new ContractService(calc);
		
		cs.processContract(contract, n);

		for(Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
