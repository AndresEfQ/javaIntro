package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa una frase");
        String sentence = scan.nextLine();

        if (sentence.equals("eureka")) {
            System.out.println("CORECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
