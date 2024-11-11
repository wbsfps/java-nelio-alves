package secao17.diamante.ex02.model.entities;

public class ConcreteScanner extends Device implements Scanner{

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanning process: " + doc);
    }

    @Override
    public String scan() {
        return "Scanned content";
    }

}
