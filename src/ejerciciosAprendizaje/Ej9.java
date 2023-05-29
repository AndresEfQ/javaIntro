package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese una frase o palabra");
        String str = scan.nextLine();

        if (str.substring(0,1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
