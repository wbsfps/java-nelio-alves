package secao8.utils;

public class Calculator {
    private final double PI = 3.14;
    private double radius;

    public Calculator(double radius) {
        this.radius = radius;
    }

    public double circumference(double radius) {
        return 2 * PI * radius;
    }
    public  double volume(double radius) {
        return (4.0/3.0) * PI * Math.pow(radius, 2);
    }
}
