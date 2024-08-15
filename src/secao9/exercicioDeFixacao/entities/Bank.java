package secao9.exercicioDeFixacao.entities;

public class Bank {
    private String numberAccount;
    private String holder;
    private double deposityValue;

    public Bank(){}

    public Bank(String numberAccount, String holder, double deposityValue) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.deposityValue = deposityValue;
    }

    public Bank(String numberAccount, String holder) {
        this.numberAccount = numberAccount;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public double getDeposityValue() {
        return deposityValue;
    }

    public void withdrawValue(double value) {
        if (this.deposityValue < value) {
            System.out.println("Valor insuficiente. Liso!!");
        }
        this.deposityValue -= value + 5.0;
    }

    public void deposity(double value) {
        this.deposityValue += value;
    }

    public String details() {
        return String.format("Account %s, holder: %s, Balance: $%.2f", numberAccount, holder, deposityValue);
    }

    @Override
    public String toString() {
        return String.format("Account %s, holder: %s, Balance: %.2f", numberAccount, holder, deposityValue);
    }
}
