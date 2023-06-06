package ejerciciosExtra;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int val = num1 * num2;
        int guess;

        System.out.println("Adivina la multiplicación de 2 números");

        do {
            System.out.println("Ingresa tu respuesta");
            guess = Integer.parseInt(sc.nextLine());
            if (guess > val) {
                System.out.println("Respuesta incorrecta, intenta por debajo");
            } else if (guess < val) {
                System.out.println("Respuesta incorrecta, intenta por encima");
            }
        } while (guess != val);

        System.out.println("!!Ganaste, los números eran " + num1 + " y " + num2);
    }
}
