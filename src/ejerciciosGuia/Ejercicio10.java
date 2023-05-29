package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.println("Escribe un número entre el 1 y el 20");
            int numb = scan.nextInt();

            while (numb < 1 || numb > 20) {
                System.out.println("El número está fuera del rango permitido, por favor ingresa un número entre el 1 y el 20");
                numb = scan.nextInt();
            }

            System.out.print(numb + " ");

            for (int j = 0; j < numb; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
