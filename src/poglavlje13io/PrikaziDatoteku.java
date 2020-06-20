package poglavlje13io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrikaziDatoteku {

    public static void main(String[] args) {
        int i;

        //Utvrđujemo da li je zadato ime datoteke
        if (args.length != 1) {
            System.out.println("Upišite: argument -> (args)");
            return;
        }
        try (FileInputStream fis = new FileInputStream(args[0])) {
            do {
                i = fis.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka ne postoji." + e);
        } catch (IOException exception) {
            System.out.println("I/O Greška " + exception);
        }
    }
}
