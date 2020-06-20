package poglavlje22nio;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelWrite {
    public static void main(String[] args) {
        
        try(FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"), 
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE )){
            //Preslikavanje datoteke u bafer
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            //Upisivanje u buffer
            for(int i =0; i <26; i ++){
                buffer.put((byte)('A' + i));
            }
        }catch(InvalidPathException exception){
            System.out.println("Pogrešna putanja " + exception);
        }catch(IOException exception){
            System.out.println("I/O greska " + exception);
        }
    }
}
