package ejerciciosExtra;

import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];
        double p1;
        double p2;
        double i1;
        double i2;

        for (int i = 0; i < 10; i++) {

            System.out.println("Por favor ingrese las notas del alumno " + (i+1) + " en orden y separadas por espacios");
            p1 = Integer.parseInt(sc.next());
            p2 = Integer.parseInt(sc.next());
            i1 = Integer.parseInt(sc.next());
            i2 = Integer.parseInt(sc.next());
            sc.nextLine();

            notas[i] = (p1*0.1) + (p2*0.15) + (i1*0.25) + (i2*0.5);
        }

        int ap = 0;
        int rep = 0;

        for (int i = 0; i < 10; i++) {
            if (notas[i] < 7) {
                rep++;
            } else {
                ap++;
            }
        }

        System.out.println("ap = " + ap);
        System.out.println("rep = " + rep);
    }
}
