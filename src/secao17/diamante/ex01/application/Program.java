package secao17.diamante.ex01.application;

import secao17.diamante.ex01.model.entities.Printer;
import secao17.diamante.ex01.model.entities.Scanner;

public class Program {
    public static void main(String[] args) {
        Printer printer = new Printer("1080");
        printer.processDoc("My letter");
        printer.print("My letter");

        Scanner scanner = new Scanner("2003");
        scanner.processDoc("My email");
        System.out.println("Scan result: " + scanner.print());
    }
}
