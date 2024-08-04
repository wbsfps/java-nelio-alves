package secao8.Main.Triangle;

import secao8.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle xTriangle = new Triangle();
        Triangle yTriangle = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        xTriangle.a = sc.nextDouble();
        xTriangle.b = sc.nextDouble();
        xTriangle.c = sc.nextDouble();
        double pXValue = (xTriangle.a + xTriangle.b + xTriangle.c) / 2;
        double xArea = Math.sqrt(pXValue * (pXValue - xTriangle.a) * (pXValue - xTriangle.b) * (pXValue - xTriangle.c));

        System.out.println("Enter the measures of triangle Y:");
        yTriangle.a = sc.nextDouble();
        yTriangle.b = sc.nextDouble();
        yTriangle.c = sc.nextDouble();
        double pYValue = (yTriangle.a + yTriangle.b + yTriangle.c) / 2;
        double yArea = Math.sqrt(pYValue * (pYValue - yTriangle.a) * (pYValue - yTriangle.b) * (pYValue - yTriangle.c));

        char moreLarger = (xArea > yArea) ? 'x' : 'y';
        System.out.println(xArea);
        System.out.println(yArea);
        System.out.println(moreLarger);
        sc.close();
    }
}
