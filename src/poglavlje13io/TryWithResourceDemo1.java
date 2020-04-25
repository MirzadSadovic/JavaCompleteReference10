package poglavlje13io;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceDemo1 {

    public static void main(String[] args) {
        int i;
        try (FileInputStream fileInputStream = new FileInputStream("zavrsni.txt")) {
            do {
                i = fileInputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Datoteka ne postoji");
        }
    }
}
