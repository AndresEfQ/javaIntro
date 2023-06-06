package ejerciciosExtra;

public class Ej12 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println((i == 3 ? "E" : i) + "-" + (j == 3 ? "E" : j) + "-" + (k == 3 ? "E" : k));
                }
            }
        }
    }
}
