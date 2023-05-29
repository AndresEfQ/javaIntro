package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        do {

            System.out.println("Ingrese un número para ser sumado");
            int value = scan.nextInt();

            if (value == 0) {
                System.out.println("Se capturó el número 0");
                break;
            }

            sum += value;
            count++;

        } while (count < 20);

        System.out.println("Los números ingresados suman " + sum);
    }
}
