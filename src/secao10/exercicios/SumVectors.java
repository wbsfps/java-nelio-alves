package secao10.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class SumVectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vão ter em cada vetor: ");
        var vectorSize = sc.nextInt();

        double[] vectorA = new double[vectorSize];
        double[] vectorB = new double[vectorSize];
        double[] vectorC = new double[vectorSize];

        System.out.println("Digite o valor para o vetor A: ");
        for (int i = 0; i < vectorA.length; i++) {
            var number = sc.nextDouble();
            vectorA[i] = number;
        }

        System.out.println("Digite o valor para o vetor B:");
        for (int i = 0; i < vectorB.length; i++) {
            var number = sc.nextDouble();
            vectorB[i] = number;
        }

        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println(Arrays.toString(vectorA));
        System.out.println(Arrays.toString(vectorB));
        System.out.println(Arrays.toString(vectorC));
    }
}
