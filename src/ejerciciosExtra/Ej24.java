package ejerciciosExtra;

import java.util.Scanner;

public class Ej24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de elementos de la secuencia fibonacci que desea ver");
        int n = Integer.parseInt(sc.nextLine());

        int[] fib = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fib[i] = 1;
            } else {
                fib[i] = fib[i-1] + fib[i-2];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(fib[i] + ", ");
        }
        System.out.println(fib[n-1]);
    }
}
