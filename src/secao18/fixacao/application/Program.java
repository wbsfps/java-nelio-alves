package secao18.fixacao.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A? ");
        var quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("id: ");
            var id = scanner.nextInt();
            a.add(id);
        }

        System.out.println("How many students for course B? ");
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("id: ");
            var id = scanner.nextInt();
            b.add(id);
        }

        System.out.println("How many students for course C? ");
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("id: ");
            var id = scanner.nextInt();
            c.add(id);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total: " + total.size());
        scanner.close();
    }
}
