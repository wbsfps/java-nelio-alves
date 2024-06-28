package secao5.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Telefonia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        double verifyMinutes = (minutes > 100) ? 50.00 + (minutes - 100) * 2 : 50.00;
        System.out.printf("Valor a pagar R$%.2f", verifyMinutes);
        sc.close();
    }
}
