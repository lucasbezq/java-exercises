package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/mm/yyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/mm/yyy): ");
		Date checkOut = sdf.parse(sc.next());

		System.out.println("Error in reservation: Check-out date must be after check-in date");
		Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
		System.out.println("Reservation: " + reservation);

		System.out.println();
		System.out.println("Enter data to update the reservation");
		System.out.print("Check-in date (dd/mm/yyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/mm/yyy): ");
		checkOut = sdf.parse(sc.next());

		String error = reservation.update(checkIn, checkOut);
		if (error != null) {
			System.out.println("Error in reservation: " + reservation);
		} 
		else {
			System.out.println("Reservation: " + reservation);
		}

		sc.close();

	}

}
