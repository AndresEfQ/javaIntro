package ejerciciosExtra;

import java.util.Scanner;

public class Ej7while {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que quiere visualizar");
        int num = Integer.parseInt(sc.nextLine());
        int orgNum = num;

        System.out.println("Ingrese un valor");
        int val = Integer.parseInt(sc.nextLine());
        num--;

        int max = val;
        int min = val;
        int sum = val;

        while (num > 0) {
            System.out.println("Ingrese un valor");
            val = Integer.parseInt(sc.nextLine());

            if (val < min) {
                min = val;
            } else if (val > max) {
                max = val;
            }
            sum += val;
            num--;
        }

        System.out.println("El valor máximo ingresado fue: " + max);
        System.out.println("El valor promedio ingresado fue: " + (sum / orgNum));
        System.out.println("El valor mínimo ingresado fue: " + min);
    }
}
