package secao10.exercicios.Entites;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(){}

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name;
    }
}
