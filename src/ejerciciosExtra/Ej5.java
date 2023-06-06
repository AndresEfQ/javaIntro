package ejerciciosExtra;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el tipo de socio (A, B o C)");
        String type = sc.nextLine();

        while (!type.equals("A") && !type.equals("B") && !type.equals("C")) {
            System.out.println("Tipo de socio no válido, por favor ingrese A, B o C");
            type = sc.nextLine();
        }

        System.out.println("Por favor ingrese el valor del tratamiento");
        double trat = Double.parseDouble(sc.nextLine());

        switch (type) {
            case "A":
                System.out.println("El costo del tratamiento para un socio tipo A es: " + (trat / 2));
                break;
            case "B":
                System.out.println("El costo del tratamiento para un socio tipo B es: " + (trat * 0.35));
                break;
            case "C":
                System.out.println("Los socios tipo C no tienen descuento, es costo del tratamiento es: " + trat);
        }
    }
}
