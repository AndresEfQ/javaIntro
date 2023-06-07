package ejerciciosExtra;

import java.util.Scanner;

public class Ej23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word;
        String[][] wordSoup = new String[20][20];
        int[] rows = {-1, -1, -1, -1, -1};
        int row;
        int col;
        boolean repeated = false;
        int randomNum;

        System.out.println("Por favor ingrese 5 palabras");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print((i+1) + ": ");
                word = sc.nextLine();

                if (word.length() < 3 || word.length() > 5) {
                    System.out.println("La palabra debe ser de 3 a 5 letras");
                }
            } while (word.length() < 3 || word.length() > 5);

            do {
                row = (int) (Math.random() * 20);
                for (int j = 0; j < 5; j++) {
                    if (rows[i] == row) {
                        repeated = true;
                        break;
                    }
                }
            } while (repeated);

            col = (int) (Math.random() * (20 - word.length()));

            for (int j = 0; j < word.length(); j++) {
                wordSoup[row][col + j] = word.substring(j, j+1).toUpperCase();
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (wordSoup[i][j] == null) {
                    randomNum = (int) (Math.random() * 10);
                    wordSoup[i][j] = String.valueOf(randomNum);
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(wordSoup[i][j] + " ");
            }
            System.out.println();
        }

    }
}
