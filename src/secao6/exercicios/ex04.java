package secao6.exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
