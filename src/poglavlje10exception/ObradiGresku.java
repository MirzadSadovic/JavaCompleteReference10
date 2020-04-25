package poglavlje10exception;

import java.util.Random;

public class ObradiGresku {

    public static void main(String[] args) {
        int a, b, c;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Izuzetak: " + e);
                a = 0;  //podesavanje a na nulu i nastavak izvrsavanja
            }
            System.out.println("a: " + a);
        }
    }
}
