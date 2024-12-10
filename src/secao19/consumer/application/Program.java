package secao19.consumer.application;

import secao19.consumer.model.entities.Product;
import secao19.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.90));

//        list.stream().map(product -> product.getPrice() * 1.1).forEach(System.out::println);

        double factor = 1.1;

        list.forEach(product -> product.setPrice(product.getPrice() * factor));
        list.forEach(System.out::println);

        /*

        - Implementação da interface
        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);

        - Reference method com método estático
        list.forEach(Product::staticPriceUpdate);
        list.forEach(System.out::println);

        - Reference método com método não estático
        list.forEach(Product::nonStaticPriceUpadate);
        list.forEach(System.out::println);

        - Expressão lambda declarada
        double factor = 1.1;
        Consumer<Product> consumer = product -> product.setPrice(product.getPrice() * factor);
        list.forEach(consumer);
        list.forEach(System.out::println);

        - Expressão lambda inline
        double factor = 1.1;

        list.forEach(product -> product.setPrice(product.getPrice() * factor));
        list.forEach(System.out::println);
        */
    }
}
