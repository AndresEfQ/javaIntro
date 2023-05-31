package ejerciciosAprendizaje;

public class Ej15 {

    public static void main(String[] args) {

        int[] integers = new int[100];

        for (int i = 0; i < 100; i++) {
            integers[i] = i + 1;
        }

        for (int i = 99; i >= 0; i--) {
            System.out.println("valor " + (100 - i) + ": " + integers[i]);
        }
    }
}
