package secao17.exercicio2.model.entities;

import secao17.exercicio2.model.entities.enums.Color;

public class Circle extends AbstractShape {
    private Double radius;

    public Circle(){super();}
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Double getRadius() {
        return radius;
    }
}
