package secao6;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Informe um número: ");
        int number = sc.nextInt();

        while (number != 0) {
            System.out.println("Informe outro número: ");
            number = sc.nextInt();
            sum += number;
        }
        System.out.println("Soma: " + sum);
        sc.close();
    }
}
