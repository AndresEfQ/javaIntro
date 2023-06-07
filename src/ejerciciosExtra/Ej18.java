package ejerciciosExtra;

import java.util.Scanner;

public class Ej18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño del vector");
        int n = Integer.parseInt(sc.nextLine());

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Por favor ingrese el número " + (i+1));
            array[i] = Integer.parseInt(sc.nextLine());
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        System.out.println("sum = " + sum);
    }
}
