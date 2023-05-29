package ejerciciosGuia;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa la frase que quieres codificar");
        String text = scan.nextLine();

        String cypherText = cypher(text);

        System.out.println(cypherText);
    }

    public static String cypher(String text) {
        String cypher = "";

        for (int i = 0; i < text.length() - 1; i++) {

            switch (text.charAt(i)) {
                case 'a', 'A':
                    cypher += "@";
                    break;
                case 'e', 'E':
                    cypher += "#";
                    break;
                case 'i', 'I':
                    cypher += "$";
                    break;
                case 'o', 'O':
                    cypher += "%";
                    break;
                case 'u', 'U':
                    cypher = cypher.concat("*");
                    break;
                default:
                    //cypher = cypher.concat(String.valueOf(text.charAt(i)));
                    cypher += text.charAt(i);
            }
        }
        return cypher;
    }
}
