package secao17.exercicio1.model.service;

public class BrazilTaxServices implements TaxService {
    @Override
    public Double tax(double amount) {
       return (amount <= 100.0) ? amount * 0.2 : amount * 0.15;
    }
}
