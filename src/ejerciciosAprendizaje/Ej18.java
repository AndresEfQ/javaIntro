package ejerciciosAprendizaje;

public class Ej18 {

    public static void main(String[] args) {

        int[][] matA = new int[4][4];
        int[][] matB = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matA[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matB[i][j] = matA[j][i];
            }
        }

        showMatrix(matA, 4);
        System.out.println();
        showMatrix(matB, 4);
    }

    public static void showMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
