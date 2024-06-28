package secao5.exercicios;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int first = sc.nextInt();
        System.out.println("Enter another number: ");
        int second = sc.nextInt();
        String validaty = (first % second == 0 || second % first == 0) ? "Mutiplos": "Nao multiplos";
        System.out.println(validaty);
        sc.close();
    }
}
