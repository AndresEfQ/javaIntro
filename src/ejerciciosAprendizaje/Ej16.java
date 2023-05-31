package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el número que desea buscar entre 1 y 100");
        int val = Integer.parseInt(sc.nextLine());

        int[] array = new int[n];
        int place = -1;
        boolean isRepeated = false;

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < n; i++) {
            if (array[i] == val) {
                if (place != -1) {
                    isRepeated = true;
                } else {
                    place = i;
                }
            }
        }

        System.out.print("El valor " + val + " se encuentra en la posición " + place);
        if (isRepeated) {
            System.out.println(" y está repetido");
        }

    }
}
