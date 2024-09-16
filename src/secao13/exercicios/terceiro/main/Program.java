package secao13.exercicios.terceiro.main;

import secao13.exercicios.terceiro.entities.Client;
import secao13.exercicios.terceiro.entities.Order;
import secao13.exercicios.terceiro.entities.OrderItem;
import secao13.exercicios.terceiro.entities.Product;
import secao13.exercicios.terceiro.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        var name = sc.nextLine();
        System.out.println("Email:");
        var email = sc.nextLine();
        System.out.println("Birth Date (DD/MM/YYYY): ");
        var birthDateString = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString, fmt);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data");
        var status = sc.nextLine().toUpperCase();
        System.out.println("How many items to this order? ");
        var quantityItems = sc.nextInt();
        sc.nextLine();

        Order order = new Order(LocalDateTime.now(ZoneId.systemDefault()).withSecond(0), OrderStatus.valueOf(status.toUpperCase()), client);

        for (int i = 1; i <= quantityItems; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name: ");
            var productName = sc.nextLine();
            System.out.println("Product price: ");
            var productPrice = sc.nextDouble();
            sc.nextLine();
            System.out.println("Quantity: ");
            var quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName));
            order.addOrderItems(orderItem);
            sc.nextLine();
        }

        System.out.println("Order Summary: ");
        System.out.println(order);
        System.out.println("Total price: " + order.total());

        sc.close();
    }
}
