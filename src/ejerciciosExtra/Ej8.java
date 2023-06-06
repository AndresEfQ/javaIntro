package ejerciciosExtra;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        int pair = 0;
        int odd = 0;
        do {
            System.out.println("Ingrese un número entero (multiplo de 5 para finalizar)");
            num = Integer.parseInt(sc.nextLine());
            if (num >= 0) {
                if (num % 2 == 0) {
                    pair++;
                } else {
                    odd++;
                }
                count++;
            }
        } while (num % 5 != 0);

        System.out.println("La cantidad de números positivos ingresados fue: " + count);
        System.out.println("La cantidad de números pares positivos ingresados fue: " + pair);
        System.out.println("La cantidad de números impares positivos ingresados fue: " + odd);
    }
}
