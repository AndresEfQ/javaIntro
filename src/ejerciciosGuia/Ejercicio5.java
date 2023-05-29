package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean flag = scan.nextBoolean();
        double num = scan.nextDouble();
        char letter = scan.next().charAt(0);

        System.out.println(flag);
        System.out.println(num);
        System.out.println(letter);

    }
}
