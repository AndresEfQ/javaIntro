package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        System.out.println("Ingrese una nota entre 0 y 10");

        Scanner scan = new Scanner(System.in);

        int nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("La nota no está entre 0 y 10, por favor ingrese una nota válida");
            nota = scan.nextInt();
        }

        System.out.println("La nota ingresada es " + nota);
    }
}
