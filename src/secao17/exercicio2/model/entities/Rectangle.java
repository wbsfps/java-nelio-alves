package secao17.exercicio2.model.entities;

import secao17.exercicio2.model.entities.enums.Color;

public class Rectangle extends AbstractShape {
    private Double width;
    private Double height;

    public Rectangle(){super();}
    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return height * width;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

}
