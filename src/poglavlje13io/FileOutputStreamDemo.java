package poglavlje13io;

import java.io.*;
//Kopiranje tekstualne datoteke

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        //Kopiranje datoteke
        try {
            fileInputStream = new FileInputStream("zavrsni.txt");
            fileOutputStream = new FileOutputStream("new.zavrsni.txt");
            do {
                i = fileInputStream.read();
                if (i != -1) {
                    fileOutputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Greska pri radu sa datotekama");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e2) {
                System.out.println("Greška pri zatvaranju izvorne datoteke");
            }
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Exception e2) {
                System.out.println("Greška pri zatvaranju ciljne datoteke");
            }
        }
    }
}
