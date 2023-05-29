package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa una frase");
        String string = scan.nextLine();

        System.out.println("La frase en mayusculas es:");
        System.out.println(string.toUpperCase());

        System.out.println("La frase en minusculas es:");
        System.out.println(string.toLowerCase());

    }
}
