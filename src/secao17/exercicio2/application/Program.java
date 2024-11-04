package secao17.exercicio2.application;

import secao17.exercicio2.model.entities.AbstractShape;
import secao17.exercicio2.model.entities.Circle;
import secao17.exercicio2.model.entities.Rectangle;
import secao17.exercicio2.model.entities.enums.Color;

public class Program {
    public static void main(String[] args) {
        AbstractShape circle = new Circle(Color.BLACK, 5.0);
        AbstractShape rectangle = new Rectangle(Color.WHITE, 3.0, 3.0);

        System.out.println("Area of circle: " + circle.area() + " Color: " + circle.getColor());
        System.out.println("Area of rectangle: " + rectangle.area() + " Color: " + rectangle.getColor());
    }
}
