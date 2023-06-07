package ejerciciosExtra;

import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño de los vectores");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Por favor ingrese el número " + (i+1) + " del primer vector");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Por favor ingrese el número " + (i+1) + " del primer vector");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }

        boolean areEqual = true;

        for (int i = 0; i < n; i++) {
           if (arr1[i] != arr2[i]) {
               areEqual = false;
               break;
           }
        }
        System.out.println("Los vectores " + (areEqual ? "" : "no ") + "son iguales");
    }
}
