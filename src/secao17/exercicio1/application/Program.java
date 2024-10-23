package secao17.exercicio1.application;

import secao17.exercicio1.model.entities.CarRental;
import secao17.exercicio1.model.entities.Invoice;
import secao17.exercicio1.model.entities.Vehicle;
import secao17.exercicio1.model.service.BrazilTaxServices;
import secao17.exercicio1.model.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do carro");
        System.out.println("Modelo do carro: ");
        var model = sc.nextLine();

        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        var start = sc.nextLine();

        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        var end = sc.nextLine();

        LocalDateTime startLocalDateTime = LocalDateTime.parse(start, fmt);
        LocalDateTime endLocalDateTime = LocalDateTime.parse(end, fmt);

        System.out.println("Entre com o preço por hora: ");
        var pricePerHour = sc.nextDouble();
        sc.nextLine();

        System.out.println("Entre com o preço por dia: ");
        var pricePerDay = sc.nextDouble();
        sc.nextLine();

        CarRental carRental = new CarRental(startLocalDateTime, endLocalDateTime, new Vehicle(model));
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());

        rentalService.processInvoice(carRental);

        System.out.println("Fatura: ");
        System.out.println("Pagamento básico: " + carRental.getInvoice().getBasicPaymente());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}
