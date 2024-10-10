package secao15.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaDeChamadasDeMetodos {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("Method1 start");
        method2();
        System.out.println("Method1 end");
    }

    public static void method2() {

        System.out.println("Method2 start");

        Scanner sc = new Scanner(System.in);

        try {
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }

        sc.close();

        System.out.println("Method2 end");

    }
}
