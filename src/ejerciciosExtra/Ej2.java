package ejerciciosExtra;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de A");
        int A = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de B");
        int B = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de C");
        int C = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de D");
        int D = Integer.parseInt(sc.nextLine());

        int aux = B;

        System.out.println("B antes = " + B);
        B = C;
        System.out.println("B después = " + B);
        System.out.println("C antes = " + C);
        C = A;
        System.out.println("C después = " + C);
        System.out.println("A antes = " + A);
        A = D;
        System.out.println("A después = " + A);
        System.out.println("D antes = " + D);
        D = aux;
        System.out.println("D después = " + D);
    }
}
