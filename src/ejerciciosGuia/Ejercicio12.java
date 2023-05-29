package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor escriba un número");
        int numb1 = scan.nextInt();
        System.out.println("Por favor escriba otro número");
        int numb2 = scan.nextInt();

        isMult(numb1, numb2);
    }

    public static void isMult(int numb1, int numb2) {

        if (numb1 % numb2 == 0) {
            System.out.println("El primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número no es múltiplo del segundo");
        }
    }
}
