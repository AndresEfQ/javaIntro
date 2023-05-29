package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] team = new String[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingresa el integrante número " + (i + 1) + " del equipo");
            team[i] = scan.nextLine();
        }

        System.out.println("El equipo está formado por:");
        for (int i = 0; i < 7; i++) {
            System.out.println(team[i]);
        }
    }
}
