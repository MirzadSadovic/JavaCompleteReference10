package poglavlje21io;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        
        //Tok se zatvara u naredbi try-with-resource
        try(FileInputStream fis = new FileInputStream("zavrsni.txt")){
            System.out.println("Raspoloživo ukupno bajtova: " + (size = fis.available()));
            int n = size/40;
            System.out.println("Prvih " + n + " bajtova datoteke učitanih jedan po jedan metodom read()");
            for(int i =0; i < n; i++){
                System.out.print((char)fis.read());
            }
            System.out.println("\nPreostalo još: " + fis.available());
            System.out.println("Učitavanje sljedećih " + n + " bajtova odjednom metodom read(b[])");
            byte b[] = new byte[n];
            if(fis.read(b) != n){
                System.err.println("ne mogu da pročitam " + n + " bajtova.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nPreostalo još: " + (size = fis.available()));
            System.out.println("Preskakanje polovine preostalih bajtova " + " metodom skip()");
            fis.skip(size/2);
            System.out.println("Preostalo još: " + fis.available());
            System.out.println("Učitavam " + n/2 + " u kranji dio niza");
            if(fis.read(b, n/2, n/2) != n/2){
                System.err.println("ne mogu da pročitam " + n/2 + "bajtova");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nPreostalo još: " + fis.available());
        }catch(IOException exception){
            System.out.println("I/O greška: " + exception);
        }
    }
 
}
