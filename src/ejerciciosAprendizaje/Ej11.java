package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa el primero número");
        int num1 = scan.nextInt();

        System.out.println("Por favor ingresa el segundo número");
        int num2 = scan.nextInt();

        int op;
        String exitOp = "N";

        do {
            do {
                System.out.println("MENU");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Elija opción");

                op = scan.nextInt();
            } while (op < 1 || op > 5);

            switch (op) {
                case 1:
                    System.out.println();
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println(num1 + " / " + num2 + " = " + (float) num1 / num2);
                    System.out.println();
                    break;
                case 5:
                    do {
                        //System.out.println();
                        System.out.println("Está seguro que desea salir del programa?");
                        exitOp = scan.nextLine();
                    } while (!exitOp.equals("S") && !exitOp.equals("N"));
                    break;
            }
        } while (exitOp.equals("N"));

        System.out.println();
        System.out.println("Gracias por utilizar nuestra calculadora");
    }
}
