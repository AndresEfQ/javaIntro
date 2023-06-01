package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isAntisymmetric = true;

        System.out.println("Ingrese el tamaño de la matriz");
        int size = Integer.parseInt(sc.nextLine());


        System.out.println("Ingrese los valores de la matriz");
        int[][] mat = fillMatrix(size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat[i][j] + mat[j][i] != 0) {
                    isAntisymmetric = false;
                    break;
                }
            }
        }

        if (isAntisymmetric) {
            System.out.println("La matríz es anti simétrica");
        } else {
            System.out.println("La matríz no es anti simétrica");
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
}
