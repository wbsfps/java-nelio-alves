package secao6.exercicios;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double x;
        double y;

        for (int i = 0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            if (x == 0) {
                System.out.println(0.0);
            } else if (y == 0) {
                System.out.println("Impossible division");
            }
            double division = x / y;
            System.out.println(division);
        }

        sc.close();
    }
}
