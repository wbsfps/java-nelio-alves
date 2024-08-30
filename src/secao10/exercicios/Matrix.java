package secao10.exercicios;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfLines = sc.nextInt();
        int numberOfColumns = sc.nextInt();

        int[][] matrix = new int[numberOfLines][numberOfColumns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        var number = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {
                    System.out.println("Position: " + i + "," + j);

                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if (j < matrix[i].length-1) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if (i < matrix.length-1) {
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }

    }
}
