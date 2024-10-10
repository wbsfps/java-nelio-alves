package secao15.exercicio.primeiro.application;

import secao15.exercicio.primeiro.model.entities.Reservation;

import java.io.IOException;
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

            LocalDate now = LocalDate.now();
            if (newCheckIn.isBefore(now) || newCheckOut.isBefore(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (!newCheckOut.isAfter(newCheckIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                reservation.updateDates(LocalDate.parse(checkIn, formatter), LocalDate.parse(checkOut, formatter));
                System.out.println(reservation);
            }
        }

        sc.close();
    }
}
