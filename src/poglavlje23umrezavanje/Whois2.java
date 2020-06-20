package poglavlje23umrezavanje;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois2 {

    public static void main(String[] args) {
        int c;
        try (Socket socket = new Socket("whois.internic.net", 43)) {
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            //Formiramo znakovni niz koji sadrži zahtjev
            String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";
            //Pretvaramo ga u niz bajtova
            byte buf[] = str.getBytes();
            //Šaljemo zahtjev
            outputStream.write(buf);
            //Učitavamo i prikazujemo odgovor
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            throw new RuntimeException("Greška " + e);
        }
    }
}
