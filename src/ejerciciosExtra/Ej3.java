package ejerciciosExtra;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese una letra (sólo se tomará la primera letra ingresada");
        String letter = sc.nextLine().substring(0, 1);

        if (letter.equalsIgnoreCase("a")
                || letter.equalsIgnoreCase("e")
                || letter.equalsIgnoreCase("i")
                || letter.equalsIgnoreCase("o")
                || letter.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada es una consonante");
        }
    }
}
