package secao19.Stream.resolvido.application;

import secao19.Stream.resolvido.model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> products = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = products.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / products.size();

            System.out.println("Average price: " + avg);

            Comparator<String> comparator = (p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());

            List<String> names = products.stream()
                    .filter(product -> product.getPrice() < avg)
                    .map(product -> product.getName())
                    .sorted(comparator.reversed()).collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
