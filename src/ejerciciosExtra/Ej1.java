package ejerciciosExtra;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un tiempo en minutos");
        int minutes = Integer.parseInt(sc.nextLine());

        int days = minutes / 1440;
        int hours = (minutes % 1440) /60;
        String daysText = days > 1 ? " días " : " día ";
        String hoursText = hours > 1 ? " horas." : " hora.";

        System.out.println(minutes + " minutos equivalen a " + days + daysText + "y " + hours + hoursText);
    }
}
