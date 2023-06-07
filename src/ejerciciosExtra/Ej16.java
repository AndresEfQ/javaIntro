package ejerciciosExtra;

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String op;

        do {
            System.out.println("Ingrese el nombre de la persona");
            name = sc.nextLine();

            System.out.println("Ingrese la edad de " + name);
            age = Integer.parseInt(sc.nextLine());

            if (age < 18) {
                System.out.println(name + " es menor de edad");
            } else {
                System.out.println(name + " es mayor de edad");
            }
            System.out.println("Desea seguir mostrando personas? SI/no");
            op = sc.nextLine();

        } while (!op.equals("no"));
    }
}
