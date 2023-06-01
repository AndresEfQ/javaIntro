package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {

        System.out.println("Ingrese una matriz para comprobar si es mágica");
        System.out.println("Las filas columnas y diagonales deben sumar el mismo valor");
        System.out.println("Sólo están permitidos números entre el 1 y el 9");
        int[][] matrix = fillMatrix(3);

        boolean isMagic = checkMagicMatrix(matrix);

        if (isMagic) {
            System.out.println("La matriz ingresada es mágica");
        } else {
            System.out.println("La matriz ingresada no es mágica");
        }
    }

    public static int[][] fillMatrix(int size) {

        int[][] result = new int[size][size];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("posición [" + i + "-" + j + "]: ");
                result[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        return result;
    }

    public static boolean checkMagicMatrix(int[][] matrix) {
        int magicSum = -1;
        int colSum = 0;
        int rowSum = 0;
        int mainDiag = 0;
        int secondDiag = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("chequeando la fila " + (i + 1) +" y la columna " + (i + 1));
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] < 1 || matrix[i][j] > 9) {
                    System.out.println("El número ubicado en la posición [" + i + "-" + j + "] no está entre 1 y 9");
                    System.out.println("Terminando el chequeo");
                    return false;
                }

                // Suma las filas
                rowSum += matrix[i][j];

                // Suma las columnas
                colSum += matrix[j][i];

                // Cada vez que i = j, suma el valor a la diagonal principal
                if (i == j) {
                    mainDiag += matrix[i][j];
                }

                // Cada vez que i + j = 2, suma el valor a la diagonal secundaria
                if (i + j == 2) {
                    secondDiag += matrix[i][j];
                }
            }
            if (magicSum == -1) {
                magicSum = rowSum;
            } else if (rowSum != magicSum) {
                System.out.println("La fila número " + (i + 1) + " suma algo diferente que la fila 1");
                System.out.println("Terminando el chequeo");
                return false;
            }
            if (colSum != magicSum) {
                System.out.println("La columna número " + (i + 1) + " suma algo diferente que la fila 1");
                System.out.println("Terminando el chequeo");
                return false;
            }
            rowSum = 0;
            colSum = 0;
        }
        System.out.println("Todas las filas y columnas suman el mísmo valor");
        System.out.println("Chequeando la diagonal principal");
        if (mainDiag != magicSum) {
            System.out.println("La diagonal principal suma algo diferente que las filas y columnas");
            System.out.println("Terminando el chequeo");
            return false;
        }

        System.out.println("La diagonal principal suma el mísmo valor que las filas y las columnas");
        System.out.println("Chequeando la diagonal secundaria");
        if (secondDiag != magicSum) {
            System.out.println("La diagonal secundaria suma algo diferente que las filas, columnas y diagonal principal");
            System.out.println("Terminando el chequeo");
            return false;
        }
        System.out.println("Todas las filas, columnas y diagonales suman el mismo valor");
        return true;
    }
}
