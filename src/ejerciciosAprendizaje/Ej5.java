package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa un número");
        int num = scan.nextInt();

        int dob = num * 2;
        int trip = num * 3;
        double sqrt = Math.sqrt(num);

        System.out.println("El doble de " + num + " es " + dob);
        System.out.println("El triple de " + num + " es " + trip);
        System.out.println("La raíz cuadrada de " + num + " es " + sqrt);
    }
}
