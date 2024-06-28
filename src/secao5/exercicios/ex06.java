package secao5.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o intervalo: ");
        double interval = sc.nextDouble();

        if (interval >= 0 && interval <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (interval > 25 && interval <= 50) {
            System.out.println("Intervalo [25,50]");
        } else if (interval > 50 && interval <= 75) {
            System.out.println("Intervalo [50,75]");
        } else if (interval > 75 && interval <= 100) {
            System.out.println("Intervalod [75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }
        sc.close();
    }
}
