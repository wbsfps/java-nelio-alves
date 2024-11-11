package secao17.diamante.ex01.model.entities;

public class Printer extends Device {

    public Printer(String serialNumber) {
        super("Printer");
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
