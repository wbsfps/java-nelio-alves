package secao18.tiposCuringaDelimitado.problema1.model.entities;

import secao18.tiposCuringaDelimitado.problema1.model.service.Shape;

public class Circle implements Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public Double getRadius() {
        return radius;
    }
}
