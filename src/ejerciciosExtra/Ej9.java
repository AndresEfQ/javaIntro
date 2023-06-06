package ejerciciosExtra;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dividendo");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el divisor");
        int div = Integer.parseInt(sc.nextLine());

        int res = num;
        int cos = 0;

        while (res > div) {
            cos++;
            res -= div;
        }

        System.out.println(num + " / " + div + " = " + cos + " con residuo " + res + ".");
    }
}
