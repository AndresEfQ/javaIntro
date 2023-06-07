package ejerciciosExtra;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de familias");
        int n = Integer.parseInt(sc.nextLine());
        int m;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Por favor ingrese el número de hijos de la familia " + (i+1));
            m = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < m; j++) {
                System.out.println("Por favor ingrese la edad del hijo " + (j+1) + " de la familia " + (i+1));
                sum += Integer.parseInt(sc.nextLine());
                count++;
            }
        }

        System.out.println("El promedio de edades de los hijos de todas las familias es " + (sum/count));
    }
}
