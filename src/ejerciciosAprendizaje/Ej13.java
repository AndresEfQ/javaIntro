package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del cuadro");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == num - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
