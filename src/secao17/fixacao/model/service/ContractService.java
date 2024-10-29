package secao17.fixacao.model.service;

import secao17.fixacao.model.entities.Contract;
import secao17.fixacao.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {this.service = service;}

    public void processContract(Contract contract, Integer months) {
        double basicQout = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = service.interest(basicQout, i);
            double fee = service.paymentFee(basicQout);
            double quota = basicQout + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
