package Execeçoes.application;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

import Execeçoes.entities.Reservation;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();

            sc.nextLine();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIN = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIN, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIN = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIN, checkOut);
            System.out.println("Reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format. Use dd/MM/yyyy.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Room number must be an integer.");
        } catch (RuntimeException e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}