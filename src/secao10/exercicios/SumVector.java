package secao10.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the size of the vector?");
        var vectorSize = sc.nextInt();
        double[] vector = new double[vectorSize];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter a number: ");
            var number = sc.nextDouble();
            vector[i] = number;
        }

        double sum = 0;
        for (double num : vector) {
            sum += num;
        }
        double average = sum / vectorSize;
        System.out.println(Arrays.toString(vector).replace("[", "").replace("]", ""));
        System.out.println(sum);
        System.out.println(average);

    }
}
