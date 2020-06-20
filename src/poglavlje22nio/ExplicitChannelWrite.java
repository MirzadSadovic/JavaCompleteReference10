package poglavlje22nio;

//Upisivanje u datoteku pomocu NIO sistema
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {

    /*public static void main(String[] args) {

        //Otvaranje kanala za datoteku unutar try-with-resource
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE)) {
            ByteBuffer buffer = ByteBuffer.allocate(26);
            //Upisivanje izvjesnog broja bajtova u bafer
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
                //Premotavanje buffera kako bi seupisaonjegov sadrzaj u datoteku
                buffer.rewind();
                //Proslijeđivanje sadržaja buffera u odredišnu datoteku
                fileChannel.write(buffer);
            }
        } catch (InvalidPathException e) {
            System.out.println("Greška putanje " + e);
        } catch (IOException exception) {
            System.out.println("I/O greška " + exception);
        }
    }*/
}
