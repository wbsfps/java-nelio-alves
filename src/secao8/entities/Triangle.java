package secao8.entities;

import java.util.Scanner;

public class Triangle {
    public Scanner sc = new Scanner(System.in);
    public double a;
    public double b;
    public double c;

    public void showPhrase(String phrase) {
        System.out.println(phrase);
    }
    public double calculateArea(double x, double y, double z, char charValue) {
        System.out.printf("Enter the measures of triangle %s: \n", charValue);
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        double pValue = (x + y + z) / 2;
        return Math.sqrt(pValue * (pValue - x) * (pValue - y) * (pValue - z));
    }
}
