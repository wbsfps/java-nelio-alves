package secao14.exercicios.segundo.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){super();}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double priceTotal() {
        return price += customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $ %.2f)", getName(), priceTotal(), customsFee);
    }

    public Double getCustomsFee() {
        return customsFee;
    }
}
