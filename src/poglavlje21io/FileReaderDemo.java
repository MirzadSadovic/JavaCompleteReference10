package poglavlje21io;

import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("phonebook.dat")){
            int c;
            //Učitavanje i prikazivanje datoteke
            while((c = fr.read())!= -1){
                System.out.print((char)c);
            }
        }catch(IOException exception){
            System.out.println("I/O greška " + exception);
        }
    }
}
