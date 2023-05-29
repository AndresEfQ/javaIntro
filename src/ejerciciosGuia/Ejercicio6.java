package ejerciciosGuia;


import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa un número");
        int num1 = scan.nextInt();

        System.out.println("Por favor ingresa otro número");
        int num2 = scan.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores que 25");
        } else if (num1 > 25){
            System.out.println("Únicamente el primer número es mayor que 25");
        } else if (num2 > 25) {
            System.out.println("Únicamente el segundo número es mayor que 25");
        } else {
            System.out.println("Ambos números son menores que 25");
        }
    }
}
