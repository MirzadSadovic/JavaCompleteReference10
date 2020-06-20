package poglavlje21io;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {

    public static void main(String[] args) {

        String privremeni = "abcdefghijklmnoprstuvwxyz";
        int duzina = privremeni.length();
        char c[] = new char[duzina];

        privremeni.getChars(0, duzina, c, 0);
        int i;

        try (CharArrayReader ulaz1 = new CharArrayReader(c)) {
            System.out.println("ulaz1 je: ");
            while ((i = ulaz1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException exception) {
            System.out.println("I/O greška " + exception);
        }
        try (CharArrayReader ulaz2 = new CharArrayReader(c, 0, 5)) {
            System.out.println("ulaz2 je: ");
            while ((i = ulaz2.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException exception) {
            System.out.println("I/O greška " + exception);
        }
    }
}
