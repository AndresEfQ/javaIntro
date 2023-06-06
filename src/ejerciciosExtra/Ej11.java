package ejerciciosExtra;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número entero");
        int num = Integer.parseInt(sc.nextLine());

        int aux = num;
        int digs = 0;

        do {
            aux /= 10;
            digs++;
        } while (aux > 0);

        System.out.println(num + " tiene " + digs + " digitos.");
    }
}
