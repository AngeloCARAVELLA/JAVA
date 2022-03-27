package it.unisannio.studenti.caravella.angelo.testers;

import java.util.*;

import it.unisannio.studenti.caravella.angelo.classes.Prenotazioni;

import java.io.*;
import java.text.ParseException;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(new File("customers.data"));
		Scanner sc2 = new Scanner(new File("flights.data"));

		Scanner s = new Scanner(System.in);
		Prenotazioni p = new Prenotazioni(sc1, sc2);

		p.printAll();

		boolean answer = false;
		System.out.println("To motivate your choices to favor only true or false");
		System.out.println("Do you want to insert a new client?");
		answer = s.nextBoolean();
		if (answer)
			p.InsertClient();

		System.out.println("Do you want to insert a new booking?");
		answer = s.nextBoolean();
		if (answer)
			p.InsertBooking();

		System.out.println("Do you want to delete a booking?");
		answer = s.nextBoolean();
		if (answer)
			p.DeleteBooking();

		System.out.println("Do you want to view the list of customers booked on a flight?");
		answer = s.nextBoolean();
		if (answer)
			p.ViewBooking();

		System.out.println("Do you want to display of all bookings of a given customer?");
		answer = s.nextBoolean();
		if (answer)
			p.View();

		System.out.println("Do you want to search for all flights departing "
				+ "after a certain date and with departure and destination cities given\r\n" + "?");
		answer = s.nextBoolean();
		if (answer)
			p.Search();

		p.printAll();
	}

}
