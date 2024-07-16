package secao6.exercicios;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wheel = 0;
        int alcool = 0;
        int diesel = 0;

        int code = sc.nextInt();

        while (code != 4) {
            if (code == 1) {
                alcool++;
            } else if (code == 2) {
                wheel++;
            } else if (code == 3) {
                diesel++;
            }

            code = sc.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println(alcool);
        System.out.println(wheel);
        System.out.println(diesel);
    }
}
