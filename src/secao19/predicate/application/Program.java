package secao19.predicate.application;

import secao19.predicate.model.entities.Product;
import secao19.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD case", 80.90));

        List<Product> overOrEquals100 = list.stream().filter((product -> product.getPrice() >= 100.0)).toList();
        overOrEquals100.forEach(System.out::println);

        /*
        Implementação de interface
        list.removeIf(new ProductPredicate());

        Reference method estático
        list.removeIf(Product::staticProductPredicate);

        Reference method não estático
        list.removeIf(Product::nonStaticProductPredicate);

        Lambda declarada
        double min = 100.0;
        Predicate<Product> pred = (product -> product.getPrice() >= min);
        list.removeIf(pred);

        Expressão lambda inline
        list.removeIf(p -> p.getPrice() >= min);
*/
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
