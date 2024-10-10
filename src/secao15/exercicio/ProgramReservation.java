package secao15.exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramReservation {
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

        Reservation reservation = new Reservation(roomNumber, LocalDate.parse(checkIn, formatter), LocalDate.parse(checkOut, formatter));
        System.out.printf("Reservation: Room %d, check-in: %s, check-out: %s, %d nights",
                roomNumber, reservation.getCheckIn().format(formatter), reservation.getCheckOut().format(formatter),
                reservation.duration());


        sc.close();
    }
}
