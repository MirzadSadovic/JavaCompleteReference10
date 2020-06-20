package poglavlje22nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;
        
        //U ovom slučaju kanal se otvara za Path objekat koji vraća metoda Paths.get().
        //Promjenljiva za putanju do datoteke nije potrebna
        try(SeekableByteChannel kanal = Files.newByteChannel(Paths.get("test.txt"))){
            //dodjeljivanje buffera
            ByteBuffer byteBuffer = ByteBuffer.allocate(128);
            
            do{
                 count = kanal.read(byteBuffer); //Učitavamo sadržaj datoteke u buffer
                if(count != -1){                //Kada dođemo na kraj datoteke prekidamo učitavanje
                    byteBuffer.rewind(); //Položaj unutar buffera vraćamo na početak kako bi smo mogli da ucitamo buffer
                    for(int i =0; i<count; i++){ //Učitavanje bajtova iz buffera i prikazivanje na ekranu kao znakove
                        System.out.print((char)byteBuffer.get());
                    }
                }
            }while(count !=-1);
            System.out.println();
            }catch(InvalidPathException exception){
                System.out.println("Greška putanje " + exception);
        }catch(IOException e){
            System.out.println("I/O greška " + e);
        }
    }
}
