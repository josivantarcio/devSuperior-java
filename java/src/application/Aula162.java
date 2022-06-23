package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aula162 {
	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Number Root: ");
		//int numbRoot = scan.nextInt();

		System.out.print("Data CheckIn: ");
		Date checkIn = sdf.parse(scan.next());

		System.out.print("Data CheckOut: ");
		Date checkOut = sdf.parse(scan.next());

		if (checkOut.before(checkIn)) {
			System.out.println("Error in Reservation: Check-out date must be after check-in date");
		} else {
			//Reservation reservation = new Reservation(numbRoot, checkIn, checkOut);
			//System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation.");
			System.out.print("Data CheckIn: ");
			checkIn = sdf.parse(scan.next());
			System.out.print("Data CheckOut: ");
			checkOut = sdf.parse(scan.next());

			/**
			String erro = reservation.updateDates(checkOut, checkIn);
			if(erro != null) {
				System.out.println("Erro in reservation: " + erro);
			}
			else {
				System.out.println("Reservation "+reservation);
			}
			*/
		}
		scan.close();
	}
}
