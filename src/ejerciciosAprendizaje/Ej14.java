package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de euros que quiere convertir");
        double euros = Integer.parseInt(sc.nextLine());

        System.out.println("A que moneda la quiere convertir? libras, dolares o yenes");
        String currency = sc.nextLine();

        while (!currency.equals("libras") && !currency.equals("dolares") && !currency.equals("yenes")) {
            System.out.println("Por favor elija entre libras, dolares o yenes");
            currency = sc.nextLine();
        }

        convert(euros, currency);
    }

    public static void convert(double euros, String currency) {

        double value = 0;

        switch (currency) {
            case "libras":
                value = euros * 0.86;
                break;
            case "dolares":
                value = euros * 1.28611;
                break;
            case "yenes":
                value = euros * 129.852;
                break;
        }

        System.out.println(euros + " euros equivalen a " + value + " " + currency);
    }
}
