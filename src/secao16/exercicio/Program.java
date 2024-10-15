package secao16.exercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a path to add folder the exercise: ");
        String strPath = sc.nextLine();

        File directory = new File(strPath + "\\exercise");
        if (!directory.exists()) {
            boolean success = directory.mkdir();
            if (success) {
                System.out.println("Directory 'exercise' created successfully.");
            } else {
                System.out.println("Failed to create the directory 'exercise'.");
                sc.close();
            }
        }

        System.out.println("How many items do you want to add?");
        int quantity = sc.nextInt();
        sc.nextLine();

        Item[] items = new Item[quantity];
        String filePath = directory.getPath() + "\\items.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < quantity; i++) {
                System.out.println("Enter product name:");
                String product = sc.nextLine();
                System.out.println("Enter product price:");
                double price = sc.nextDouble();
                System.out.println("Enter product quantity:");
                int quantityItems = sc.nextInt();
                sc.nextLine();

                double totalPrice = price * quantityItems;
                items[i] = new Item(product, totalPrice, quantityItems);
                bw.write(items[i].getProduct() + "," + items[i].getPrice() + "," + items[i].getQuantity());
                bw.newLine();
            }

            System.out.println("Items have been written to the file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
