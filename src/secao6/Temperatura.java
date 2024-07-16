package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.println("Temperatura em Celsius");
            double tempCelsius = sc.nextDouble();
            double tempFahrenheit = ((9 * tempCelsius) / 5) + 32;
            System.out.println("Equivalente em Fahrenheit: " + tempFahrenheit);
            System.out.println("Deseja repetir (s/n)");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

    }
}
