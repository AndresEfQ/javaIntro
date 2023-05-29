package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa un número");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }
    }
}
