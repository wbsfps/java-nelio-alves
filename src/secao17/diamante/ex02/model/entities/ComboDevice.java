package secao17.diamante.ex02.model.entities;

public class ComboDevice extends Device implements Printer, Scanner {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    @Override
    public String scan() {
       return "Scanned content";
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}