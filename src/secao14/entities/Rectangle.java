package secao14.entities;

import secao14.entities.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(){super();}

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double area() {
        return getHeight() * getWidth();
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }
}
