package secao6.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            double numeratorWeightedAverage = (x * 2) + (y * 3) + (z * 5);
            final double WEIGHTAVERAGEDENOMINATOR = 10;
            double weightedAverage = numeratorWeightedAverage / WEIGHTAVERAGEDENOMINATOR;
            System.out.printf("%.1f \n", weightedAverage);
        }
    }
}
