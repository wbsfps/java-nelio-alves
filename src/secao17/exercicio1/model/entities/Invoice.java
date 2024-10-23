package secao17.exercicio1.model.entities;

public class Invoice {
    private Double basicPaymente;
    private Double tax;


    public Invoice(){}

    public Invoice(Double basicPaymente, Double tax) {
        this.basicPaymente = basicPaymente;
        this.tax = tax;
    }

    public Double getBasicPaymente() {
        return basicPaymente;
    }

    public Double getTax() {
        return tax;
    }

    public Double getTotalPayment(){
        return getBasicPaymente() + getTax();
    }


}
