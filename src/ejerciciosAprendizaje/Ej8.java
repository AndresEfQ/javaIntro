package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa una frase o palabra de 8 de largo");
        String sentence = scan.nextLine();

        if (sentence.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
