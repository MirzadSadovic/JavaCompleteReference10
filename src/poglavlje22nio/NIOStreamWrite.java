package poglavlje22nio;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {

    public static void main(String[] args) {

        try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))) {
            for (int i = 0; i < 26; i++) {
                os.write((byte) ('A' + i));
            }
        } catch (InvalidPathException e) {
            System.out.println("Pogrešna putanja " + e);
        } catch (IOException exception) {
            System.out.println("I/O greska " + exception);
        }
    }
}
