package secao19.experienciaComparator.application;

import secao19.experienciaComparator.model.entities.Product;
import secao19.experienciaComparator.model.service.MyComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        list.sort(comparator);

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
