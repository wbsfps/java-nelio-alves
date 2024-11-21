package secao18.tiposCuringaDelimitado.problema1.model.entities;

import secao18.tiposCuringaDelimitado.problema1.model.service.Shape;

public class Rectangle implements Shape {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return getHeight() * getWidth();
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }
}
