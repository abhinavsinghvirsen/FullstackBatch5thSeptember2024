package out.production.java.basicPrograms;

import java.util.Scanner;

public class AdditionOfMatrix {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();


        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];


        System.out.println("Enter A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Enter B");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = A[i][j] + B[i][j];
            }
        }


        System.out.println("Resul Matrix after add");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
