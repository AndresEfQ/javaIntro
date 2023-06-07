package ejerciciosExtra;

import java.util.Scanner;

public class Ej22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño de la matriz separado por espacios");

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j  < m - 1; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println(matrix[i][m-1] + "]");
        }
        
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("sum = " + sum);
    }
}
