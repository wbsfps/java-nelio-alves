package secao18.tiposCuringaDelimitado.problema1.application;

import secao18.tiposCuringaDelimitado.problema1.model.entities.Circle;
import secao18.tiposCuringaDelimitado.problema1.model.entities.Rectangle;
import secao18.tiposCuringaDelimitado.problema1.model.service.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(3.0, 2.0));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(3.0));

        System.out.println("Total: " + totalAreas(shapes));
        System.out.println("Total: " + totalAreas(circles));
    }

    public static Double totalAreas(List<? extends Shape> list) {
        double sum = 0.0;

        for (Shape o : list) {
            sum += o.area();
        }
        return sum;
    }
}
