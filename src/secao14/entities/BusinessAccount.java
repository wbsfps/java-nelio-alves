package secao14.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Account account, Double loanLimit) {
        super(account.getNumber(), account.getHolder(), account.getBalance());
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
}
