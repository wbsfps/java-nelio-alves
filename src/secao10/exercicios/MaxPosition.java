package secao10.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números quer digitar? ");
        var vectorSize = sc.nextInt();


        double[] vector = new double[vectorSize];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            var number = sc.nextDouble();
            vector[i] = number;
        }

        int positionMaxValue = 0;
        double max = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
                positionMaxValue = i;
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(vector));
        System.out.println(positionMaxValue);

    }
}
