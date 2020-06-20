package poglavlje21io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//Ulančavanje ulaznih podataka
class InputStreamEnumerator implements Enumeration<FileInputStream> {

    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement());
        } catch (IOException exception) {
            return null;
        }
    }

}

public class SequenceInputStreamDemo {

    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement("datoteka1.txt");
        files.addElement("datoteka2.txt");
        files.addElement("datoteka3.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        
        try{
            while((c = input.read()) != -1){
                System.out.print((char) c);
            }
        }catch(NullPointerException e){
            System.out.println("Greška pri otvaranju datoteke.");
        }catch(IOException e){
            System.out.println("I/O Greška: " + e);
        }finally{
            try{
                input.close();
            }catch(IOException e){
                System.out.println("Greška pri zatvaranju objekta SequenceInputStream");
            }
        }
    }
}
