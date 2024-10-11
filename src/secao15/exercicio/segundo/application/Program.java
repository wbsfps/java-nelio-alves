package secao15.exercicio.segundo.application;

import secao15.exercicio.segundo.model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Room number: ");
        var roomNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Check-in date: ");
        var checkIn = sc.nextLine();
        System.out.println("Check-out date: ");
        var checkOut = sc.nextLine();

        LocalDate newCheckIn = LocalDate.parse(checkIn, formatter);
        LocalDate newCheckOut = LocalDate.parse(checkOut, formatter);

        if (!newCheckOut.isAfter(newCheckIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber, LocalDate.parse(checkIn, formatter), LocalDate.parse(checkOut, formatter));
            System.out.println(reservation);
            System.out.println("Enter data to update the reservation: ");

            System.out.println("Check-in date: ");
            checkIn = sc.nextLine();
            System.out.println("Check-out date: ");
            checkOut = sc.nextLine();

            String error = reservation.updateDates(LocalDate.parse(checkIn, formatter), LocalDate.parse(checkOut, formatter));

            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println(reservation);
            }
        }

        sc.close();
    }
}
