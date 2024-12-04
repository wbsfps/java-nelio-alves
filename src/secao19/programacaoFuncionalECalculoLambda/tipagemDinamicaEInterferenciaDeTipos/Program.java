package secao19.programacaoFuncionalECalculoLambda.tipagemDinamicaEInterferenciaDeTipos;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        list.forEach(System.out::println);
    }
}
