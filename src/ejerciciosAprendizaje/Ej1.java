package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba el primer número");
        int num1 = scan.nextInt();

        System.out.println("Escriba el segundo número");
        int num2 = scan.nextInt();

        System.out.println(num1 + num2);
    }
}
