package secao19.criandoFuncoesQueRecebemFuncoesComoParametro.application;

import secao19.criandoFuncoesQueRecebemFuncoesComoParametro.model.entities.Product;
import secao19.criandoFuncoesQueRecebemFuncoesComoParametro.model.services.ProductServices;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double sum = 0.0;

        list.stream().filter(product -> product.getName().startsWith("T")).forEach(System.out::println);

        ProductServices productServices = new ProductServices();

        sum = productServices.filteredSum(list, product -> product.getName().charAt(0) == 'T');
        System.out.println("Sum: " + String.format("%.2f", sum));
        sum = productServices.filteredSum(list, product -> product.getPrice() < 100);
        System.out.println("Sum: " + String.format("%.2f", sum));
    }
}
