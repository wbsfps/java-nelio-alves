package secao17.exercicio1.model.entities;

public class Vehicle {
    private String model;

    public Vehicle(){}

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model;
    }
}
