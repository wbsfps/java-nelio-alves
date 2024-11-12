package secao17.defaultmethods.model.service;

import java.security.InvalidParameterException;

public class BrazilInterestService {
    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double payment(double amount, double months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow((1 + (interestRate / 100)), months);
    }

    public Double getInterestRate() {
        return interestRate;
    }
}
