package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program73 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = scan.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollar = scan.nextDouble();
		
		double x = CurrencyConverter.Convert(price, dollar);
		System.out.printf("Amount to be paid in reais = R$ %.2f",x);
				
		scan.close();
	}
}
