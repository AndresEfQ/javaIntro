package ejerciciosExtra;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = Integer.parseInt(sc.nextLine());

        if (isPrime(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
