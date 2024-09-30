package secao14.main;

import secao14.entities.Circle;
import secao14.entities.Rectangle;
import secao14.entities.Shape;
import secao14.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MetodosAbstratos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        var quantity = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle (r/c)?");
            var choose = sc.nextLine().toUpperCase().charAt(0);

            if (choose == 'R') {
                System.out.println("Color (BLACK/BLUE/RED): ");
                var color = sc.nextLine().toUpperCase();

                System.out.println("Width: ");
                var width = sc.nextDouble();
                sc.nextLine();

                System.out.println("Height: ");
                var height = sc.nextDouble();
                sc.nextLine();

                Shape rectangle = new Rectangle(Color.valueOf(color.toUpperCase()), width, height);
                shapes.add(rectangle);

            } else if (choose == 'C') {
                System.out.println("Color (BLACK/BLUE/RED): ");
                var color = sc.nextLine().toUpperCase();

                System.out.println("Radius: ");
                var radius = sc.nextDouble();
                sc.nextLine();

                Shape circle = new Circle(Color.valueOf(color.toUpperCase()), radius);
                shapes.add(circle);
            } else {
                System.out.println("Value inavalid! Retry");
            }
        }

        System.out.println("SHAPE AREAS: ");
        shapes.forEach(s -> System.out.println(s.area()));

        sc.close();
    }
}
