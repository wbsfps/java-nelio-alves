package secao10.exercicios;

import java.util.Scanner;

public class FilterNumbersNegatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the size of the vector?");
        var vectorSize = sc.nextInt();
        int[] vector = new int[vectorSize];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter a number: ");
            var number = sc.nextInt();
            vector[i] = number;
        }
        System.out.println("Numbers negatives");
        for (int j : vector) {
            if (j < 0) {
                System.out.println(j);
            }
        }
    }
}
