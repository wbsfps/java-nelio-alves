package secao17.defaultmethods.application;

import secao17.defaultmethods.model.service.BrazilInterestService;
import secao17.defaultmethods.model.service.InterestService;
import secao17.defaultmethods.model.service.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();

        BrazilInterestService brazilInterestService = new BrazilInterestService(2.0);
        double payment = brazilInterestService.payment(amount, months);

        System.out.println("Brazil Interest");
        System.out.println("Payment after " + months + " months: ");
        System.out.printf("%.2f%n", payment);

        UsaInterestService usaInterestService = new UsaInterestService(1.0);
        payment = usaInterestService.payment(amount, months);

        System.out.println("Usa Interest");
        System.out.println("Payment after " + months + " months: ");
        System.out.printf("%.2f%n", payment);


        InterestService interestService = new BrazilInterestService(2.0);
        payment = interestService.payment(amount, months);
        System.out.println(payment);


        sc.close();
    }
}
