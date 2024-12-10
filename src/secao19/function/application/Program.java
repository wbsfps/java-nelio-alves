package secao19.function.application;

import secao19.function.model.entities.Product;
import secao19.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        list.stream().map(p -> p.getName().toUpperCase()).forEach(System.out::println);

        /*
        Implementação de interface
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);

        Reference method estático
        List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
        names.forEach(System.out::println);

        Reference method não estático
        List<String> names = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());
        names.forEach(System.out::println);

        Lambda declarada
        Function<Product, String> function = (product -> product.getName().toUpperCase());
        list.stream().map(function).forEach(System.out::println);

        Expressão lambda inline
        list.stream().map(p -> p.getName().toUpperCase()).forEach(System.out::println);
    */
    }
}
