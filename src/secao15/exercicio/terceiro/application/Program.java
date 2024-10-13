package secao15.exercicio.terceiro.application;

import secao15.exercicio.terceiro.model.entities.Reservation;
import secao15.exercicio.terceiro.model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            var roomNumber = sc.nextInt();
            sc.nextLine();

            System.out.println("Check-in date: ");
            var checkIn = sc.nextLine();
            System.out.println("Check-out date: ");
            var checkOut = sc.nextLine();

            LocalDate newCheckIn = LocalDate.parse(checkIn, formatter);
            LocalDate newCheckOut = LocalDate.parse(checkOut, formatter);

            Reservation reservation = new Reservation(roomNumber, newCheckIn, newCheckOut);
            System.out.println(reservation);
            System.out.println("Enter data to update the reservation: ");

            System.out.println("Check-in date: ");
            checkIn = sc.nextLine();
            System.out.println("Check-out date: ");
            checkOut = sc.nextLine();

            reservation.updateDates(LocalDate.parse(checkIn, formatter), LocalDate.parse(checkOut, formatter));

            System.out.println(reservation);
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }


        sc.close();
    }
}
