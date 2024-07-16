package secao6.exercicios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        String password = sc.nextLine();

        while (!password.equals("2002")) {
            System.out.println("Acesso negado!");
            password = sc.nextLine();
        }

        System.out.println("Acesso permitido!");
    }
}
