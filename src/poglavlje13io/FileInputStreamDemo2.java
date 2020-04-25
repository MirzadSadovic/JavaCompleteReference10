package poglavlje13io;

import java.io.*;

public class FileInputStreamDemo2 {

    public static void main(String[] args) {

        int i;
        FileInputStream fileInputStream = null;

        //Sljedeci blok koda otvara datoteku i ucitava znakove iz nje
        //dok ne naiđe na EOF, a zatim u bloku finally zatvara datoteku.
        try {
            fileInputStream = new FileInputStream("zavrsni.txt");

            do {
                i = fileInputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Datoteka ne postoji");
        } catch (IOException e) {
            System.out.println("Greska pri U/I operaciji");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Greška pri zatvaranju datoteke");
            }
        }
    }
}
