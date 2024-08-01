package secao7;

import java.util.Scanner;

public class OperadoresBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 89;
        int b = 60;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        int mask = 32;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }
    }
}
