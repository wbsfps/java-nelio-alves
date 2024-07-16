package secao6.exercicios;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumIn = 0;
        int sumOut = 0;

        for (int i = 10; i < 21 ; i++) {
            int n = sc.nextInt();

            if (n >= 10 && n <= 20) {
                sumIn++;
            } else {
                sumOut++;
            }
        }

        System.out.println(sumIn);
        System.out.println(sumOut);
    }
}
