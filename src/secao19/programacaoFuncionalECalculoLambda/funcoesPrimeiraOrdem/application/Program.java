package secao19.programacaoFuncionalECalculoLambda.funcoesPrimeiraOrdem.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        list.sort(Program::compareProducts);

        list.forEach(System.out::println);
    }
}
