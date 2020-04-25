package poglavlje13io;

import java.io.*;

//Prikazivanje sadrzaja datoteke
public class FileInputStreamDemo1 {

    public static void main(String[] args) {

        int i;
        FileInputStream fileInputStream;

        /*//Prvo utvrđujemo da li je upisano ime datoteke
         if(args.length !=1){
         System.out.println("Upišite: PrikaziDatoteku <zavrsni.txt>");
         return;
         }*/
        //Pokusavamo da otvorimo datoteku
        try {
            fileInputStream = new FileInputStream("zavrsni.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka nemoze da se otvori");
            return;
        }
        //U ovoj fazi datoteka je otvorena i moze da se cita
        //Sljedeci blok koda ucitava znakove dok ne naiđe na EOF
        try {
            do {
                i = fileInputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Greška pri čitanju datoteke");
        }
        //Zatvaramo datoteku
        try {
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Greška pri zatvaranju datoteke");
        }
    }
}
