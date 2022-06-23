package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Exercice149 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> lists = new ArrayList<Product>();

		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tipo = scan.next().charAt(0);

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Price: ");
			Double price = scan.nextDouble();

			if (tipo == 'c') {
				Product product = new Product(name, price);
				lists.add(product);
			} else if (tipo == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY) ");
				Date date = sdf.parse(scan.next());
				Product product = new UsedProduct(name, price, date);
				lists.add(product);
			}else if (tipo == 'i'){
				System.out.print("Customs fee: ");
				double customFee = scan.nextDouble();
				Product product = new ImportedProduct(name, price, customFee);
				lists.add(product);
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product p : lists) {
			System.out.println(p.priceTag());
		}
		
		scan.close();

	}
}
