package poglavlje22nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path putanja = null;
        
        //Prvo formiramo putanju za datoteku
        try{
            putanja = Paths.get("test.txt");
        }catch(InvalidPathException e){
            System.out.println("Greška putanje " + e);
            return;
        }
        
        //Zatim otvaramo kanal za datoteku unutar bloka try-with-resource
        try(SeekableByteChannel kanal = Files.newByteChannel(putanja)){
            //Dodjeljujemo buffer
            ByteBuffer byteBuffer = ByteBuffer.allocate(128);
            do{
                count = kanal.read(byteBuffer); //Učitavamo sadržaj datoteke u buffer
                if(count != -1){                //Kada dođemo na kraj datoteke prekidamo učitavanje
                    byteBuffer.rewind(); //Položaj unutar buffera vraćamo na početak kako bi smo mogli da ucitamo buffer
                    for(int i =0; i<count; i++){
                        System.out.print((char)byteBuffer.get());
                    }
                }
            }while(count !=-1);
            System.out.println();
        }catch(IOException e){
            System.out.println("I/O greska " + e);
        }
    }
}
