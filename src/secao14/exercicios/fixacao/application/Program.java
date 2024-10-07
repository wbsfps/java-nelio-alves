package secao14.exercicios.fixacao.application;

import secao14.exercicios.fixacao.entities.Individual;
import secao14.exercicios.fixacao.entities.LegalEntity;
import secao14.exercicios.fixacao.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Person> persons = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        var quantity = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.println("Individual or company? (i/c)");
            var choose = sc.nextLine().toLowerCase().charAt(0);

            System.out.println("Name: ");
            var name = sc.nextLine();
            System.out.println("Anual income: ");
            var anualIncome = sc.nextDouble();
            sc.nextLine();

            if (choose == 'i') {
                System.out.println("Health expenditures:");
                var healthExpenditures = sc.nextDouble();
                sc.nextLine();
                Person person = new Individual(name, anualIncome, healthExpenditures);
                persons.add(person);
            } else if (choose == 'c') {
                System.out.println("Number of employees: ");
                var numberOfEmployees = sc.nextInt();
                sc.nextLine();
                Person person = new LegalEntity(name, anualIncome, numberOfEmployees);
                persons.add(person);
            } else {
                System.out.println("Invalid value!");
            }

            System.out.println("Person " + name + " registred!");
        }

        double sum = 0.0;
        for (Person person : persons) {
            System.out.println(person.getName() + ": $ " + person.calculateTax());
            sum += person.calculateTax();
        }

        System.out.println("Total taxes: $ " + sum);

        sc.close();
    }
}
