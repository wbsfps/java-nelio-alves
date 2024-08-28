package secao10.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list;
        list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco"); // adicinando pelo indice
        System.out.println(list.size());
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println();

        // list.remove(1); removendo pelo indice
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("Index of Bob " + list.indexOf("Bob"));
        System.out.println("Index of Bob " + list.indexOf("Marco"));

        System.out.println();

        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println();

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
