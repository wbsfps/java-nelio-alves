package secao17.diamante.ex02.model.entities;

public abstract class Device {
    private String serialNumber;

    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void processDoc(String doc) {}
}
