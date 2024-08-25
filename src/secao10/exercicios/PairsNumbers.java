package secao10.exercicios;

import java.util.Scanner;

public class PairsNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        var quantity = sc.nextInt();

        double[] vector = new double[quantity];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite um número: ");
            var number = sc.nextInt();
            vector[i] = number;
        }
        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println(vector[i]);
                count++;
            }
        }
        System.out.println("Quantidade de números pares: " + count);
    }
}
