package ejerciciosExtra;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la altura de la escalera");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
