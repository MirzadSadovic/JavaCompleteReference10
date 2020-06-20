package poglavlje21io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        String izvor = "Doslo je vrijeme da svi dobri gradjani\n"
                + " pomognu svojoj zemlji \n"
                + " i plate sve poreze koje duguju.";
        char buffer[] = new char[izvor.length()];
        izvor.getChars(0, izvor.length(), buffer, 0);

        try (
                FileWriter f0 = new FileWriter("datoteka1.txt");
                FileWriter f1 = new FileWriter("datoteka2.txt");
                FileWriter f2 = new FileWriter("datoteka3.txt");) {
            
            //Upisivanje u prvu datoteku
            for(int i = 0; i <buffer.length; i+=2){
                f0.write(buffer[i]);
            }
            //Upisivanje u drugu datoteku
            f1.write(buffer);
            
            //Upisivanje u treću datoteku
            f2.write(buffer, buffer.length-buffer.length/4, buffer.length/4);

        } catch (IOException exception) {
            System.out.println("Došlo je do greške " + exception);
        }
    }
}
