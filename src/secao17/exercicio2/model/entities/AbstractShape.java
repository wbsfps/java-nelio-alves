package secao17.exercicio2.model.entities;

import secao17.exercicio2.model.entities.enums.Color;
import secao17.exercicio2.model.services.Shape;

public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape(){}
    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
