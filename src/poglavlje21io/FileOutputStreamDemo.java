package poglavlje21io;

import java.io.*;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        String source = "Doslo je vrijeme da svi dobri gradjani\n"
                + " pomognu svojoj zemlji\n"
                + " i plate sve poreze koje joj duguju.";
        byte buf[] = source.getBytes();

        try (FileOutputStream f0 = new FileOutputStream("datoteka1.txt");
                FileOutputStream f1 = new FileOutputStream("datoteka2.txt");
                FileOutputStream f2 = new FileOutputStream("datoteka3.txt")) {

            //Upisivanje u prvu datoteku
            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }

            //Upisivanje u drugu
            f1.write(buf);

            //Upisivanje u trecu
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException exception) {
            System.out.println("Došlo je do greške " + exception);

        }
    }
}
