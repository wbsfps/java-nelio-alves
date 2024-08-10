package secao8.Main.Circumference;

import secao8.utils.Calculator2;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator2.circumference(radius);
        double v = Calculator2.volume(radius);

        System.out.printf("Circumference: %.2f\nVolume:%.2f\nPI value: %.2f", c, v, Calculator2.PI);

        sc.close();
    }
}
