package secao8.exercises.entities;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }
    public double perimeter() {
        return (width * 2) + (height * 2);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }


    public String details(String text, double value) {
        return String.format("%s = %.2f", text, value);
    }
}
