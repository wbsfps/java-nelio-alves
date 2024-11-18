package secao18.problema1Reuso.application;


import secao18.problema1Reuso.model.entities.PrintService;
import secao18.problema1Reuso.model.entities.PrintServiceString;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService printService = new PrintService();
        PrintServiceString printServiceString = new PrintServiceString();
        System.out.print("How many values? ");
        int quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            printService.addValue(scanner.nextInt());
            printServiceString.addValue(scanner.next());
        }

        printService.print();
        System.out.println("First: " + printService.first());
        printServiceString.print();
        System.out.println("First: " + printServiceString.first());
        scanner.close();
    }
}
