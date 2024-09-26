package secao14.exercicios.segundo.application;

import secao14.exercicios.segundo.entities.ImportedProduct;
import secao14.exercicios.segundo.entities.Product;
import secao14.exercicios.segundo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        
        System.out.println("Enter the number of products: ");
        var quantityProducts = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= quantityProducts; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char conditionOfProduct = sc.nextLine().charAt(0);

            System.out.println("Name: ");
            var name = sc.nextLine();
            System.out.println("Price: ");
            var price = sc.nextDouble();
            sc.nextLine();
            
            if (conditionOfProduct == 'i') {
                System.out.println("Customs fee: ");
                var customsFee = sc.nextDouble();
                sc.nextLine();
                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);

            } else if (conditionOfProduct == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                var date = sc.nextLine();
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.parse(date, fmt);
                Product product = new UsedProduct(name, price, localDate);
                products.add(product);
            } else {
                Product product = new Product(name, price);
                products.add(product);
            }

            System.out.println("The product " + name + " has been registered successfully!");
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
