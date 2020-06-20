package poglavlje22nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        //Otvaranje kanala za datoteku
        try(FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))){
     
            long velicinaDat = channel.size();//Utvrđujemo velicinu datoteke
            //Preslikavanje datoteke u buffer
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, velicinaDat);
            for(int i =0; i< velicinaDat; i ++){
                System.out.print((char)buffer.get());
            }
            System.out.println();
        }catch(InvalidPathException exception){
            System.out.println("Greška putanje " + exception);
        }catch(IOException exception){
            System.out.println("I/O greška " + exception);
        }
    }
}
