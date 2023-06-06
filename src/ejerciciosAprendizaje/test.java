package ejerciciosAprendizaje;

public class test {

    public static void main(String[] args) {

        int val = 11;
        int val2 = 11/10;

        System.out.println("val2 = " + val2);

        int[][] arr = {{0,1,2}, {0,1}};
        System.out.println("arr = " + arr[0][2]);

        for (int[] fila : arr) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
        }
    }
}
