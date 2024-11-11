package secao17.diamante.ex01.model.entities;

public class Scanner extends Device {
    public Scanner(){super("Scanner");}
    public Scanner(String serialNumber){super(serialNumber);}
    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    public String print() {
        return "Scanned content";
    }
}
