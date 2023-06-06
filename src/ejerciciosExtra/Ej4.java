package ejerciciosExtra;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un número entre 1 y 10");
        int decNum = Integer.parseInt(sc.nextLine());
        int aux = decNum;

        StringBuilder romNum = new StringBuilder();
/*
        if (aux == 10) {
            romNum.append("X");
        } else if (aux == 4) {
            romNum.append("IV");
        } else if (aux == 9) {
            romNum.append("IX");
        } else {
            while (aux > 5) {
                romNum.append("V");
                aux -= 5;
            }
            while (aux > 0) {
                romNum.append("I");
                aux -= 1;
            }
        }
*/
        while (aux > 0) {
            if (aux == 9 || aux == 4) {
                romNum.append("I");
                aux++;
            } else if (aux == 10) {
                romNum.append("X");
                aux -= 10;
            } else if (aux > 4) {
                romNum.append("V");
                aux -= 5;
            } else {
                romNum.append("I");
                aux--;
            }
        }
        System.out.println(decNum + " en números romanos es: " + romNum);
    }
}
