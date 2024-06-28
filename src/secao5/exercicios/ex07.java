package secao5.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("q3");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("q4");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else {
            System.out.println("Coordenadas inválidas");
        }
        sc.close();
    }
}
