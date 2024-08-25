package secao10.exercicios;

import secao10.exercicios.Entites.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BoardingHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] vect = new Student[10];

        System.out.println("How many rooms will be rented? ");
        var numberOfRoomsWillBeRented = sc.nextInt();
        sc.nextLine();

        Student student;
        for (int i = 1; i <= numberOfRoomsWillBeRented; i++) {
            System.out.println("Rent #" + i);
            var name = sc.nextLine();
            var email = sc.nextLine();
            student = new Student(name, email);

            System.out.println("Which room do you want to book?");
            var room = sc.nextInt();
            sc.nextLine();
            vect[room] = student;
        }

        System.out.println("Busy rooms");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ":" + vect[i]);
            }
        }
    }
}
