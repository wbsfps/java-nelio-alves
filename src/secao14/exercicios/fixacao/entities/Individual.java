package secao14.exercicios.fixacao.entities;

public class Individual extends Person {
    private Double healthExpenses;

    public Individual(){super();}

    public Individual(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double calculateTax() {
        return (
                getAnnualIncome() < 20000.0) ?

                getAnnualIncome() * 0.15 - healthExpenses * 0.5
                :
                getAnnualIncome() * 0.25 - healthExpenses * 0.5;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }
}
