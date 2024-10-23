package secao17.exercicio1.model.entities;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){}

    public CarRental(LocalDateTime start, LocalDateTime end, Vehicle vehicle) {
        this.start = start;
        this.finish = end;
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "CarRental{" +
                "start=" + getStart() +
                ", finish=" + getFinish() +
                ", vehicle=" + getVehicle() +
                ", invoice=" + invoice +
                '}';
    }
}
