package poglavlje13io;

//Kopiranje datoteke
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceDemo2 {

    public static void main(String[] args) {
        
        int i;
        
        try (FileInputStream fileInputStream = new FileInputStream("zavrsni.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("new.zavrsni.txt")) {
            do {
                i = fileInputStream.read();
                if (i != -1) {
                    fileOutputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O error");
        }
    }
}
