package poglavlje22nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class NIOCopy {
    public static void main(String[] args) {
        
        if(args.length != 2){
            System.out.println("Način upotrebe: Kopiranje iz izvora na odrediste");
        }
        try{
            Path izvor = Paths.get(args[0]);
            Path odrediste = Paths.get(args[1]);
            
            Files.copy(izvor, odrediste, StandardCopyOption.REPLACE_EXISTING);
            
        }catch(InvalidPathException exception){
            System.out.println("Greška u putanji " + exception);
        }catch(IOException exception){
            System.out.println("I/O greška " + exception);
        }
    }
}
