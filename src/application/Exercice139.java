package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Exercice139 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter client data: ");
		System.out.print("name: ");
		String name = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.next();
		System.out.print("Birth Date: ");
		Date birthDate = sdf.parse(scan.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("\nEnter Order Data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scan.next().toUpperCase());

		Order order = new Order(new Date(), status, client);

		System.out.println("\nHow Many to this order? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String nameProduct = scan.next();
			System.out.print("Product price: ");
			Double priceProduct = scan.nextDouble();
			System.out.print("Quantity: ");
			Integer quantProduct = scan.nextInt();
			
			OrderItem orderItem = new OrderItem(quantProduct, priceProduct, new Product(nameProduct, priceProduct));
			order.addItems(orderItem);
		}

		System.out.println(order);

		scan.close();
	}
}
