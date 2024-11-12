package secao17.defaultmethods.model.service;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {
    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
