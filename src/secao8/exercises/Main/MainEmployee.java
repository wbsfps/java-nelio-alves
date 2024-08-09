package secao8.exercises.Main;

import secao8.exercises.entities.Employee;

import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double grossSalary = sc.nextDouble();
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        employee.showDetails();

        System.out.println(employee.netSalary());

        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
    }
}
