package secao8.Main.Triangle;

import secao8.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class MainTriangle2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle xTriangle = new Triangle();
        Triangle yTriangle = new Triangle();

        double calculateX = xTriangle.calculateArea(xTriangle.a, xTriangle.b, xTriangle.c, 'x');
        double calculateY = yTriangle.calculateArea(yTriangle.a, yTriangle.b, yTriangle.c, 'y');

        char moreLarger = (calculateX > calculateY) ? 'x' : 'y';
        System.out.println(calculateX);
        System.out.println(calculateY);
        System.out.println(moreLarger);
        sc.close();
    }
}
