package secao8.exercises.Main;

import secao8.exercises.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> notes = new ArrayList<>();

        System.out.println("Insert the three notes:");
        for (int i = 0; i < 3; i++) {
            double note = sc.nextDouble();
            notes.add(note);
        }

        Student student = new Student(notes);

        System.out.println(student.showNotes());

        System.out.println(student.isApproved(notes));
    }
}
