package poglavlje23umrezavanje;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class URLDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL hp =new URL("http://www.HerbSchildt.com/WhatsNew");
        
        System.out.println("Protokol: " + hp.getProtocol());
        System.out.println("Port(Broj priključaka): " + hp.getPort());
        System.out.println("Host(Računar): " + hp.getHost());
        System.out.println("Datoteka: " + hp.getFile());
        System.out.println("Ext(Spoljni oblik): " + hp.toExternalForm());
    }
}
