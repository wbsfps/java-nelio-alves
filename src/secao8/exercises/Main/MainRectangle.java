package secao8.exercises.Main;

import secao8.exercises.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.details("Area", rectangle.area()));
        System.out.println(rectangle.details("Perimeter",rectangle.perimeter()));
        System.out.println(rectangle.details("Diagonal", rectangle.diagonal()));

        sc.close();
    }
}
