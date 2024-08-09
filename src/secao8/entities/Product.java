package secao8.entities;

import java.util.Scanner;

public class Product {
    private Scanner sc = new Scanner(System.in);
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showText(String text) {
        System.out.println(text);
    }

    public void updateProduct(){
        System.out.printf("Updated data: %s, $%.2f, %d units, Total: $%.2f \n", name, price, quantity, totalValueInStock());
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return String.format("Product data: %s, $%.2f, %d units, Total: $%.2f \n", name, price, quantity, totalValueInStock());
    }
}
