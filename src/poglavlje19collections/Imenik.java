package poglavlje19collections;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* Jednostavna baza podataka telefonskih brojeva
 koja koristi objekt tipa Properties */
public class Imenik {

    public static void main(String[] args) throws IOException {

        Properties ht = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String number;
        FileInputStream fileInputStream = null;
        boolean changed = false;

        //Pokušavamo otvaranje datoteke phonebook.dat
        try {
            fileInputStream = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            //zanemarujemo slučaj nepostojeće datoteke
        }
        //Ako datoteka phonebook već postoji, učitavamo postojeće telefonske brojeve
        try {
            if (fileInputStream != null) {
                ht.load(fileInputStream);
                fileInputStream.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        //Korisniku omogućavamo da unese nova imena i brojeve.
        do {
            System.out.println("Upišite novo ime " + " ('quit' za kraj): ");
            name = bufferedReader.readLine();
            if (name.equals("quit")) {
                continue;
            }
            System.out.println("Upišite broj: ");
            number = bufferedReader.readLine();

            ht.setProperty(name, number);
            changed = true;
        } while (!name.equals("quit"));

        //Ako su se podaci promjenili snimamo ih u datoteku.
        if (changed) {
            try (FileOutputStream fileOutputStream = new FileOutputStream("phonebook.dat")) {
                ht.store(fileOutputStream, "Telephone Book");
            }
        }
        //Tražimo broj koji odgovara zadatom imenu
        do {
            System.out.println("Unesite ime vlasnika broja " + " ('quit' za kraj): ");
            name = bufferedReader.readLine();
            if (name.equals("quit")) {
                continue;
            }
            number = ht.getProperty(name);
            System.out.println(number);
        } while (!name.equals("quit"));

    }

}
