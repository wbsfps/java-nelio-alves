package secao8.Main.Circumference;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f\nVolume:%.2f\nPI value: %.2f", c, v, PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
    public static double volume(double radius) {
        return (4.0/3.0) * PI * Math.pow(radius, 2);
    }
}
