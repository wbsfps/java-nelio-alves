package secao8.exercises.Main;

import secao8.exercises.utils.CurrencyConverter;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainCurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What's the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        System.out.print("Amount to be paid in reais = " + CurrencyConverter.dollarToReal(amount, dollarPrice));
        sc.close();
    }
}
