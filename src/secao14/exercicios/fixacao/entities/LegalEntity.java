package secao14.exercicios.fixacao.entities;

public class LegalEntity extends Person {
    private Integer numberOfEmployees;

    public LegalEntity(){super();}

    public LegalEntity(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double calculateTax() {
        return (numberOfEmployees > 10) ? (getAnnualIncome() * 0.14) : (getAnnualIncome() * 0.16);
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
