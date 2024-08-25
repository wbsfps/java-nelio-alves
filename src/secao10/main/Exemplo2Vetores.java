package secao10.main;

import secao10.entities.Product;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo2Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var number = sc.nextInt();
        Product[] heightVector = new Product[number];

        for (int i = 0; i < heightVector.length; i++) {
            System.out.println("Enter a name product and price: ");
            var name = sc.next();
            var price = sc.nextDouble();
            heightVector[i] = new Product(name, price);
        }

        double sum = 0;
        for (Product product : heightVector) {
            sum += product.getPrice();
        }
        double average = sum / number;
        System.out.println(Arrays.toString(heightVector));
        System.out.println("Average = " + average);
        sc.close();
    }
}
