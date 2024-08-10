package secao8.Main.Circumference;

import secao8.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        Calculator calculator = new Calculator(radius);

        System.out.println(calculator.circumference(radius));
        System.out.println(calculator.volume(radius));
    }
}
