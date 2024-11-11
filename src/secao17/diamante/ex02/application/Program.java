package secao17.diamante.ex02.application;

import secao17.diamante.ex02.model.entities.*;

public class Program {
    public static void main(String[] args) {
        ComboDevice comboDevice = new ComboDevice("2081");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");


        ConcretePrinter printer = new ConcretePrinter("1080");
        printer.processDoc("My Letter");
        printer.print("My Letter");

        ConcreteScanner scanner = new ConcreteScanner("2081");
        scanner.processDoc("My dissertation");
        System.out.println(scanner.scan());
    }
}
