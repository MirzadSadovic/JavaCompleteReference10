package poglavlje22nio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class PrikaziDatoteku {

    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Upišite: argument -> (args)");
            return;
        }
        try (InputStream inputStream = Files.newInputStream(Paths.get(args[0]))) {
            do {
                i = inputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (InvalidPathException e) {
            System.out.println("Greška putanje " + e);
        } catch (IOException exception) {
            System.out.println("I/O greška " + exception);
        }
    }
}
