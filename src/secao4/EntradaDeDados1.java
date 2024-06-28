package secao4;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println("Voce digitou: " + x);
        int y = sc.nextInt();
        System.out.println("Voce digitou: " + y);
        double z = sc.nextDouble();
        System.out.println("Voce digitou: " + z);
        char w = sc.next().charAt(0);
        System.out.println("Voce digitou: " + w);
        String t = sc.next();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        System.out.printf("Voce digitou: %s / %d / %.1f", t,b,c);
    }
}
