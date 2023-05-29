package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa una Temperatura en grados centígrados");
        float centTemp = scan.nextFloat();

        float farTemp = 32 + (9 * centTemp / 5);

        System.out.println(centTemp + " grados centígrados equivalen a " + farTemp + " grados Fahrenheit");
    }
}
