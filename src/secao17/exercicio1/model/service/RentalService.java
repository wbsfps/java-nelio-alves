package secao17.exercicio1.model.service;

import secao17.exercicio1.model.entities.CarRental;
import secao17.exercicio1.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxServices;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxServices) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServices = taxServices;
    }

    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;

        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public TaxService getTaxServices() {
        return taxServices;
    }
}
