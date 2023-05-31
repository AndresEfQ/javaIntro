package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del vector");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        int[] digitArray = new int[5];
        int digits = 0;
        int val;

        for (int i = 0; i < 5; i++) {
            digitArray[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        for (int i = 0; i < n; i++) {
            val = arr[i];
            while (val > 0) {
                digits++;
                val = val / 10;
            }

            digitArray[digits - 1]++;
            digits = 0;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("La cantidad de números con " + (i + 1) + " dígitos es " + digitArray[i]);
        }
    }
}
