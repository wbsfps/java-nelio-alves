package secao9.exercicioDeFixacao.main;

import secao9.exercicioDeFixacao.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Enter account number and account holder: ");
        var accountNumber = sc.nextLine();
        var holder = sc.nextLine();

        System.out.println("Is there na initial deposity? (y/n)");
        char verification = sc.nextLine().charAt(0);

        if (verification == 'n') {
            bank = new Bank(accountNumber, holder);
        } else if (verification == 'y') {
            System.out.println("Enter initial deposity value: ");
            var deposityValue = sc.nextDouble();
            bank = new Bank(accountNumber, holder, deposityValue);
        }

        System.out.println("Account data: ");
        System.out.println(bank.details());

        System.out.println("Enter a deposity value: ");
        var value = sc.nextDouble();
        bank.deposity(value);
        System.out.println("Updated account data: ");
        System.out.println(bank.details());

        System.out.println("Enter a withdraw value: ");
        value = sc.nextDouble();
        bank.withdrawValue(value);
        System.out.println("Updated account data: ");
        System.out.println(bank.details());
    }
}
