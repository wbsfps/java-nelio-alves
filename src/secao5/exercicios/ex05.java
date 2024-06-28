package secao5.exercicios;

import java.util.Scanner;

public class ex05 {
    public static Double calculate(Double price, Integer quantity) {
            return price * quantity;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gostaria de qual produto e qual quantidade dele? ");
        int option = -1;
        while (option != 0) {
            int quantity = sc.nextInt();
            double price = sc.nextDouble();

            System.out.printf("O pedido custa: R$ %.2f", calculate(price, quantity));
        }
        sc.close();
    }
}
