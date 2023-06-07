package ejerciciosExtra;

import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la operación que desea realizar ej '1 + 2'");
        int num1 = Integer.parseInt(sc.next());
        String op = sc.next();
        int num2 = Integer.parseInt(sc.next());
        int result = 0;
        boolean isValid = true;

        switch (op) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = mult(num1, num2);
                break;
            case "/":
                result = div(num1, num2);
                break;
            default:
                System.out.println("Operación '" + op + "' no soportada");
                isValid = false;
        }
        if (isValid) {
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int mult(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}
