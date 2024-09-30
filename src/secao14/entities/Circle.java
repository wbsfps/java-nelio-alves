package secao14.entities;

import secao14.entities.enums.Color;

public class Circle extends Shape {
    private Double radius;

    public Circle(){super();}

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double area() {
        return Math.PI * (Math.pow(getRadius(), 2));
    }

    public Double getRadius() {
        return radius;
    }
}
