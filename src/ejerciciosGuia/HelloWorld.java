/*
Este programa escribe el texto "Hola Mundo" en al consola, utilizando el
metodo System.out.println
*/

package ejerciciosGuia;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        //La linea 12 muestra el mensaje por pantalla al ejecutar el programa
        System.out.println("Hola mundo");

        Scanner scan = new Scanner(System.in);

        int num1 = 5;
        int num2 = 2;

        int suma = num1 + num2;

        int division = num1 / num2;

        boolean flag = num2 < num1;

        System.out.println(suma + " " + division + " " + flag);
        System.out.println(division);
        System.out.println(flag);

        String name = "Andrés";
        int age = 34;

        System.out.println("My name is " + name + " and I'm " + age + " years old.");

        //String lastName = scan.nextLine();
        //int age2 = scan.nextInt();

        // double pi = scan.nextDouble();
        // boolean flag2 = scan.nextBoolean();

        // System.out.println(pi + " " + flag2);

        char a = 'a';
        String string = String.valueOf(a);
        System.out.println(string);
    }
}
