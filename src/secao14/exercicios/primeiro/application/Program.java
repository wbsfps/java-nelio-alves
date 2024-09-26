package secao14.exercicios.primeiro.application;

import secao14.exercicios.primeiro.entities.Employee;
import secao14.exercicios.primeiro.entities.OutsourceEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        var quantityEmployees = sc.nextInt();
        sc.nextLine();


        for (int i = 1; i <= quantityEmployees; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.println("Outsourcerd (y/n)? ");
            var condition = sc.nextLine();

            String name;
            int hour;
            double valuePerHour;

            if (condition.equals("y")) {
                System.out.println("Name: ");
                name = sc.nextLine();
                System.out.println("Hour: ");
                hour = sc.nextInt();
                sc.nextLine();
                System.out.println("Value per hour: ");
                valuePerHour = sc.nextDouble();
                sc.nextLine();
                System.out.println("Additional charge: ");
                var additional = sc.nextDouble();

                Employee employee = new OutsourceEmployee(name, hour, valuePerHour, additional);
                employee.addEmployee(employee);
                sc.nextLine();
            } else {
                System.out.println("Name: ");
                name = sc.nextLine();
                System.out.println("Hour: ");
                hour = sc.nextInt();
                sc.nextLine();
                System.out.println("Value per hour: ");
                valuePerHour = sc.nextDouble();
                sc.nextLine();

                Employee employee = new Employee(name, hour, valuePerHour);
                employee.addEmployee(employee);
            }

        }

        System.out.println(Employee.detalis());

        sc.close();
    }
}
