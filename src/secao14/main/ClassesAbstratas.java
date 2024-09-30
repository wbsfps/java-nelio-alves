package secao14.main;

import secao14.entities.Account;
import secao14.entities.BusinessAccount;
import secao14.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ClassesAbstratas {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount(1001, "Alex", 500.0, 0.01);
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 300.0, 500.0);

        List<Account> list = new ArrayList<>();
        list.add(acc1);
        list.add(acc2);
        list.add(acc3);

        double sum = 0;

        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.println(sum);

        List<Double> sum10 = list.stream().map(v -> v.getBalance() + 10).toList();
        System.out.println(sum10);

        for (Account acc : list) {
            acc.deposit(10);
        }
        for (Account acc : list) {
            System.out.println(acc.getBalance());
        }
    }
}
