package poglavlje21io;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {

    public static void main(String[] args) throws IOException {

        CharArrayWriter caw = new CharArrayWriter();
        String s = "Ovo treba da bude pretvoreno u niz";
        char buffer[] = new char[s.length()];

        s.getChars(0, s.length(), buffer, 0);

        try {
            caw.write(buffer);
        } catch (IOException exception) {
            System.out.println("Greška pri upisivanju u buffer.");
            return;
        }
        System.out.println("Buffer kao znakovni niz");
        System.out.println(caw.toString());
        System.out.println("Prebacivanje u niz");

        char c[] = caw.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println("\nUpućivanje u izlazni tok");

        try (FileWriter fw = new FileWriter("test.txt")) {
            caw.writeTo(fw);
        } catch (IOException exception) {
            System.out.println("I/O greska " + exception);
        }
        System.out.println("Vraćanje na početak");
        caw.reset();

        for (int i = 0; i < 3; i++) {
            caw.write("X");

        }
        System.out.println(caw.toString());
    }
}
