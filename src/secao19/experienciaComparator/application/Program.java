package secao19.experienciaComparator.application;

import secao19.experienciaComparator.model.entities.Product;
import secao19.experienciaComparator.model.service.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        list.sort(new MyComparator());

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
