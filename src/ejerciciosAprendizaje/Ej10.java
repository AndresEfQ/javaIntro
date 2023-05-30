package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese un valor límite mayor que 0");
        int limit = scan.nextInt();

        while (limit <= 0) {
            System.out.println("El límite ingresado no es mayor que 0, por favor intente de nuevo");
            limit = scan.nextInt();
        }

        int sum = 0;
        int val;

        do {
            System.out.println("Por favor ingrese un número");
            val = scan.nextInt();
            sum += val;
        } while (sum < limit);

        System.out.println("La suma de todos los números ingresados es " + sum + " lo cuál supera al límite " + limit);
    }
}
