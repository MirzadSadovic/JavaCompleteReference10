package poglavlje21io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String s = "Ovo treba da bude pretvoreno u niz";
        byte buf[] = s.getBytes();

        try {
            byteArrayOutputStream.write(buf);
        } catch (IOException exception) {
            System.out.println("Greška pri upisivanju u baffer");
            return;
        }
        System.out.println("Buffer kao znakovni niz");
        System.out.println(byteArrayOutputStream.toString());
        System.out.println("Preslikavanje u niz bajtova");
        byte b[] = byteArrayOutputStream.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }

        System.out.println("\nUpućivanje na izlazni tok()");

        //Upravljanje izlaznim tokom za datoteku pomoću naredbe try-with-resource
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (IOException e) {
            System.out.println("I/O greška " + e);
            return;
        }
        System.out.println("Vraćanje na početak");
        byteArrayOutputStream.reset();

        for (int i = 0; i < 3; i++) {
            byteArrayOutputStream.write('X');
        }
        System.out.println(byteArrayOutputStream.toString());
    }
}
