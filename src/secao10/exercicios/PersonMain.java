package secao10.exercicios;

import secao10.exercicios.Entites.Person;

import java.util.Arrays;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        var vectorSize = sc.nextInt();
        sc.nextLine();

        Person[] persons = new Person[vectorSize];

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Dados da %dª pessoa \n", i + 1);

            System.out.println("Nome: ");
            var name = sc.nextLine();
            System.out.println("Idade: ");
            var age = sc.nextInt();
            System.out.println("Altura: ");
            var height = sc.nextDouble();
            sc.nextLine();

            persons[i] = new Person(name, age, height);
        }


        double sum = 0;
        for (Person person : persons) {
            sum += person.getHeight();
        }
        double average = sum / vectorSize;

        Person[] vectorPersonsLessSixteenAge = new Person[vectorSize];
        int countLessSixteen = 0;

        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (person.getAge() < 16) {
                vectorPersonsLessSixteenAge[countLessSixteen] = person;
                countLessSixteen++;
            }
        }


        double calculatePercentage = ((double) countLessSixteen / vectorSize) * 100.0;

        System.out.println("Altura média: " + average);
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + calculatePercentage + "%");
        System.out.println("Pessoas com menos de 16 anos: " + Arrays.toString(Arrays.copyOf(vectorPersonsLessSixteenAge, countLessSixteen)));

    }
}
