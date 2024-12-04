package secao19.experienciaComparator.application;

import secao19.experienciaComparator.model.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program3Lamba {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        Comparator<Product> comparator = (p1, p2) -> {
            return  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        Comparator<Product> comparator2 = (p1, p2) ->
            p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comparator);
        list.sort(comparator2);
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
