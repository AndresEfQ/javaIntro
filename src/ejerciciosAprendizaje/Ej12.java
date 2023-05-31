package ejerciciosAprendizaje;

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rightCount = 0;
        int wrongCount = 0;
        String str;

        do {
            str = sc.nextLine();

            if (str.length() <= 5 && str.charAt(0) == 'X' && str.charAt(str.length() - 1) == 'O') {
                rightCount++;
            } else {
                wrongCount++;
            }
        } while (!str.equals("&&&&&"));

        System.out.println("Lectura finalizada");
        System.out.println("En total se obtuvieron " + rightCount + " lecturas correctas");
        System.out.println("y " + wrongCount + " lecturas incorrectas.");
    }
}
