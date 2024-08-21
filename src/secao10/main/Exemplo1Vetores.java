package secao10.main;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo1Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        double[] heightVector = new double[number];
        double sum = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();
            heightVector[i] = height;
        }

        for (double num : heightVector) sum += num;

        double average = sum / number;

        System.out.println(Arrays.toString(heightVector));
        System.out.printf("AVERAGE HEIGHT = %.2f", average);

        sc.close();
    }
}
