package secao18.problema2TypeSafetyEPerfomance.application;


import secao18.problema2TypeSafetyEPerfomance.model.entities.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService printService = new PrintService();
        System.out.print("How many values? ");
        int quantity = scanner.nextInt();
        printService.addValue("Maria");
        for (int i = 0; i < quantity; i++) {
            printService.addValue(scanner.nextInt());
        }

        printService.print();
        Integer x = (Integer) printService.first();
        System.out.println("First: " + x);
        scanner.close();
    }
}
