package secao19.Stream.fixacao.application;

import secao19.Stream.fixacao.model.entities.Employee;
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

        System.out.println("Enter a salary");
        double salary = sc.nextDouble();

        System.out.println("Email of people whose salary is more than: " + salary);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

        List<String> emails = employees.stream()
                .filter(employee -> employee.getSalary() > salary)
                .map(employee -> employee.getEmail()).collect(Collectors.toList());
        emails.forEach(System.out::println);

        double sumOfSalarys = employees.stream()
                .filter(employee -> employee.getName().startsWith("B"))
                .map(employee -> employee.getSalary())
                .reduce(0.0, (x, y) -> x + y);
        System.out.println("Sum of salary of people whose name starts with 'B': " + sumOfSalarys);



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
