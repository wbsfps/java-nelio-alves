package secao8;

import java.util.Locale;
import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Enter the measures of triangle X:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double pXValue = (a + b + c) / 2;
        double xArea = Math.sqrt(pXValue * (pXValue - a) * (pXValue - b) * (pXValue - c));

        System.out.println("Enter the measures of triangle Y:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double pYValue = (a + b + c) / 2;
        double yArea = Math.round(Math.sqrt(pYValue * (pYValue - a) * (pYValue - b) * (pYValue - c)));

        char moreLarger = (xArea > yArea) ? 'x' : 'y';
        System.out.println(xArea);
        System.out.println(yArea);
        System.out.println(moreLarger);
        sc.close();
    }
}
