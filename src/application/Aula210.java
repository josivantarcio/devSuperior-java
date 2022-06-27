package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import service.BrazilTaxService;
import service.RentalService;

public class Aula210 {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data:");
		System.out.print("Car Model: ");
		String modelCar = scan.nextLine();
		System.out.print("Pickup (dd/mm/yyyy hh:mm): ");
		Date checkIn = sdf.parse(scan.nextLine());
		System.out.print("Return (dd/mm/yyyy hh:mm): ");
		Date checkOut = sdf.parse(scan.nextLine());

		CarRental carRental = new CarRental(checkIn, checkOut, new Vehicle(modelCar)); 

		System.out.print("Enter Price per Hour: ");
		double hourPrice = scan.nextDouble();
		System.out.print("Enter Price per Day: ");
		double dayPrice = scan.nextDouble();

		RentalService rentalService = new RentalService(hourPrice, dayPrice, new BrazilTaxService());
		rentalService.processInvoice(carRental);

		System.out.println("INVOICE:");
		System.out.println("Basic Payment: " + carRental.getInvoice().getBasicPayment());
		System.out.println("TAX: " + carRental.getInvoice().getTax());
		System.out.println("Total Payment: " + carRental.getInvoice().totalPayment());

		scan.close();
	}
}
