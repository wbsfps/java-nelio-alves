package secao14.entities;

import secao14.entities.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(){}

    public Shape(Color color) {
        this.color = Color.valueOf(String.valueOf(color).toUpperCase());
    }

    public abstract Double area();

    public Color getColor() {
        return color;
    }
}
