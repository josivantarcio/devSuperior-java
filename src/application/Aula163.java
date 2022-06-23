package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;
import exceptions.DomainException;

public class Aula163 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		try {
			System.out.print("Number Root: ");
			int numbRoot = scan.nextInt();
	
			System.out.print("Data CheckIn: ");
			Date checkIn = sdf.parse(scan.next());
	
			System.out.print("Data CheckOut: ");
			Date checkOut = sdf.parse(scan.next());
	
			Reservation reservation = new Reservation(numbRoot, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
	
			
			System.out.println();
			System.out.println("Enter data to update the reservation.");
			System.out.print("Data CheckIn: ");
			checkIn = sdf.parse(scan.next());
			System.out.print("Data CheckOut: ");
			checkOut = sdf.parse(scan.next());
	
			reservation.updateDates(checkOut, checkIn);
			System.out.println("Reservation " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Data Invalida " + e.getStackTrace());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}

		scan.close();
	}
}
