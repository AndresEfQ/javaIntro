package ejerciciosExtra;

public class Ej20 {

    public static void main(String[] args) {

        int[] array = new int[10];

        fillArray(array);
        printArray(array);
    }

    public static void fillArray(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static void printArray(int[] array) {
        int length = array.length;

        System.out.print("[");

        for (int i = 0; i < length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[length - 1] + "]");
    }
}
