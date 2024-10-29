package secao17.fixacao.application;

import secao17.fixacao.model.entities.Contract;
import secao17.fixacao.model.entities.Installment;
import secao17.fixacao.model.service.ContractService;
import secao17.fixacao.model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato: ");

        System.out.println("Number: ");
        var number = sc.nextInt();
        sc.nextLine();
        System.out.println("Data: ");
        var date = sc.nextLine();
        LocalDate dateFmt = LocalDate.parse(date, fmt);
        System.out.println("Valor do contrato:");
        var value = sc.nextDouble();

        Contract contract = new Contract(number, dateFmt, value);

        System.out.println("Quantidade de parcelas: ");
        var quantity = sc.nextInt();
        sc.nextLine();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, quantity);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
