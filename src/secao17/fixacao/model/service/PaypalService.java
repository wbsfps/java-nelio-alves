package secao17.fixacao.model.service;

public class PaypalService implements OnlinePaymentService {

    private final Double FEE_PAYMENT = 0.02;
    private final Double MONTHLY_INTEREST = 0.01;

    public Double paymentFee(double amount) {
        return amount * FEE_PAYMENT;
    }

    public Double interest(double amount, Integer months) {
        return amount * months * MONTHLY_INTEREST;
    }
}
