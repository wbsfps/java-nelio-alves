package secao17.fixacao.model.service;

public interface OnlinePaymentService {
    Double paymentFee(double amount);

    Double interest(double amount, Integer months);
}
