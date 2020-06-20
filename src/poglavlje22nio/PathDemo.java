package poglavlje22nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {

    public static void main(String[] args) {
        Path putanja = Paths.get("test.txt");

        System.out.println("Ime datoteke: " + putanja.getName(0));
        System.out.println("Putanja: " + putanja);
        System.out.println("Apsolutna putanja: " + putanja.toAbsolutePath());
        System.out.println("Roditelj: " + putanja.getParent());

        if (Files.exists(putanja)) {
            System.out.println("Datoteka postoji");
        } else {
            System.out.println("Datoteka ne postoji");
        }
        try {
            if (Files.isHidden(putanja)) {
                System.out.println("Datoteka je skrivena");
            } else {
                System.out.println("Datoteka nije skrivena");
            }
        } catch (IOException exception) {
            System.out.println("I/O greska " + exception);
        }
        Files.isWritable(putanja);
        System.out.println("U datoteku se moze upisivati");

        Files.isReadable(putanja);
        System.out.println("Datoteka se moze citati");

        try {
            BasicFileAttributes attributes = Files.readAttributes(putanja, BasicFileAttributes.class);
            if (attributes.isDirectory()) {
                System.out.println("Datoteka je dir.");
            } else {
                System.out.println("Datoteka nije dir.");
            }
            if (attributes.isRegularFile()) {
                System.out.println("Obična datoteka");
            } else {
                System.out.println("Nije obična datoteka");
            }
            if (attributes.isSymbolicLink()) {
                System.out.println("Datoteka je simbolicna veza");
            } else {
                System.out.println("Datoteka nije simbolicna veza");
            }
            System.out.println("Vrijeme posljednje izmjene datoteke: " + attributes.lastModifiedTime());
            System.out.println("Veličina datoteke: " + attributes.size() + "bajtova");
        } catch (IOException exception) {
            System.out.println("Greška pri učitavanju atributa " + exception);
        }
    }
}
