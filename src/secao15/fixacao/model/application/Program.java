package secao15.fixacao.model.application;

import secao15.fixacao.model.exceptions.BusinessException;
import secao15.fixacao.model.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        try {
            System.out.println("Number: ");
            var number = sc.nextInt();
            sc.nextLine();
            System.out.println("Holder: ");
            var holder = sc.nextLine();
            System.out.println("Initial balance: ");
            var balance = sc.nextDouble();
            sc.nextLine();
            System.out.println("Withdraw limit: ");
            var limit = sc.nextDouble();
            sc.nextLine();

            Account account = new Account(number, holder, balance, limit);

            System.out.println("Enter amount for withdraw: ");
            var amount = sc.nextDouble();
            sc.nextLine();

            account.withdraw(amount);

            System.out.println(account);
        } catch (BusinessException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
