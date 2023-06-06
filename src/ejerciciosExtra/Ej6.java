package ejerciciosExtra;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas personas desea ingresar?");
        int num = Integer.parseInt(sc.nextLine());

        double sum = 0;
        int smallCount = 0;
        double smallSum = 0;
        double val;

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1));
            val = Double.parseDouble(sc.nextLine());
            sum += val;

            if (val < 1.6) {
                smallCount++;
                smallSum += val;
            }
        }

        System.out.println("El promedio de estaturas que se encuentra por debajo de 1.60 m es: " + (smallSum / smallCount) + " m.");
        System.out.println("El promedio de estaturas en general es: " + (sum / num) + " m.");
    }
}
