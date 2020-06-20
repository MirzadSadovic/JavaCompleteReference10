package poglavlje23umrezavanje;

//Promjer upotrebe klase Socket

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws Exception {
        int c;
        
        //Pravimo Socket(uticnicu)koju  povezujemo na internic.net, priključak broj 43.
        Socket socket = new Socket("whois.internic.net", 43);
        
        //Otvaramo ulazni i izlazni tok
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        
        //Formiramo znakovni niz koji sadrži zahtjev
        String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";
        
        //Pretvaramo ga u niz bajtova
        byte buf[] = str.getBytes();
        
        //Šaljemo zahtjev
        outputStream.write(buf);
        
        //Učitavamo i prikazujemo odgovor
        while((c = inputStream.read()) != -1){
            System.out.print((char)c);
        }
        socket.close();
    }
}
