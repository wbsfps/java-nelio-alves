package secao15.exercicio.segundo.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer numberRoom;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation(){}

    public Reservation(Integer numberRoom, LocalDate checkIn, LocalDate checkOut) {
        this.numberRoom = numberRoom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer duration() {
        return (int) ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public String updateDates(LocalDate checkIn, LocalDate checkOut) {

        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            return "Reservation dates for update must be future dates";
        }

        if (!checkOut.isAfter(checkIn)) {
            return "Check-out date must be after check-in date";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    public Integer getNumberRoom() {
        return numberRoom;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("Reservation: Room %d, check-in: %s, check-out: %s, %d nights",
                numberRoom, getCheckIn().format(formatter), getCheckOut().format(formatter),
                duration());
    }
}
