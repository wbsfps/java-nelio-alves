package secao18.solucaoComGenerics.application;


import secao18.solucaoComGenerics.model.entities.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<String> printService = new PrintService<>();
        System.out.print("How many values? ");
        int quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            printService.addValue(scanner.next());
        }

        printService.print();
        String x = printService.first();
        System.out.println("First: " + x);
        scanner.close();
    }
}
