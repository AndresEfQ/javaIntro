package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String op;
        do {
            System.out.println("Desea digitar los valores de la matriz de 10 x 10? S/n");
            op = sc.nextLine();
            if (op.equals("")) {
                op = "S";
            }
        } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

        int[][] outMatrix = op.equalsIgnoreCase("S") ? fillMatrix(10) : fillRandomMatrix(10);

        System.out.println("La matriz de 10 x 10 es:");
        showMatrix(outMatrix, 10);

        do {
            System.out.println("Desea digitar los valores de la matriz de 3 x 3? S/n");
            op = sc.nextLine();
            if (op.equals("")) {
                op = "S";
            }
        } while (!op.equalsIgnoreCase("S") && !op.equalsIgnoreCase("N"));

        int[][] inMatrix = op.equalsIgnoreCase("S") ? fillMatrix(3) : fillRandomMatrix(3);

        System.out.println("La matriz de 3 x 3 es:");
        showMatrix(inMatrix, 3);

        int[] submatrixPosition = checkSubMatrix(outMatrix, inMatrix);

        if (submatrixPosition[0] == -1 || submatrixPosition[1] == -1) {
            System.out.println("La matriz de 3 x 3 no está contenida en la matriz de 10 x 10");
        } else {
            System.out.println("La matriz de 3 x 3 si está contenida en la matriz de 10 x 10");
            System.out.println("El valor en la posición 0,0 de la matriz de 3 x 3 se encuentra en la fila " + submatrixPosition[0] + " y la columna " + submatrixPosition[1] + " de la matriz de 10 x 10");
        }
    }

    public static int[][] fillMatrix(int size) {

        int[][] result = new int[size][size];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("ingresa fila " + (i + 1) + " separada por espacios: ");
            for (int j = 0; j < size; j++) {
                result[i][j] = Integer.parseInt(sc.next());
            }
            sc.nextLine();
        }
        return result;
    }

    public static int[][] fillRandomMatrix(int size) {

        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = (int) (Math.random() * 10);
            }
        }
        return result;
    }

    public static void showMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] checkSubMatrix(int[][] matrix1, int[][] matrix2) {

        int[] result = {-1, -1};
        boolean isSubMatrix = false;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix1[i][j] == matrix2[0][0]) {
                    result[0] = i;
                    result[1] = j;
                    isSubMatrix = true;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrix1[i+k][j+l] != matrix2[k][l]) {
                                isSubMatrix = false;
                                result[0] = -1;
                                result[1] = -1;
                            }
                        }
                    }
                    if (isSubMatrix) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
