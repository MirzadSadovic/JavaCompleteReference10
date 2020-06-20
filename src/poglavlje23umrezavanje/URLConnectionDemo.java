package poglavlje23umrezavanje;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionDemo {

    public static void main(String[] args) throws Exception {
        int c;
        URL url = new URL("https://www.it-akademija.com/");
        URLConnection urlc = url.openConnection();

        //Datum
        long d = urlc.getDate();
        if (d == 0) {
            System.out.println("Nema podataka o vremenu");
        } else {
            System.out.println("Datum: " + new Date(d));
        }
        //Vrsta sadržaja
        System.out.println("Vrsta sadržaja " + urlc.getContentType());

        //Rok trajanja sadržaja resursa
        d = urlc.getExpiration();
        if (d == 0) {
            System.out.println("Nema podataka o roku trajanja sadržaja");
        } else {
            System.out.println("Rok trajanja " + new Date(d));
        }

        //Datum poslije izmjene
        d = urlc.getLastModified();
        if (d == 0) {
            System.out.println("Nema podatka o datumu zadnje izmjene sadržaja");
        } else {
            System.out.println("Vrijeme posljednje izmjene " + new Date(d));
        }

        //Dužina sadržaja
        long duzina = urlc.getContentLengthLong();
        if (duzina == -1) {
            System.out.println("Nema podatka o duzini sadrzaja");
        } else {
            System.out.println("Dužina sadržaja " + duzina);
        }
        if (duzina != 0) {
            System.out.println("===Sadržaj===");
            try (InputStream sadrzaj = urlc.getInputStream()) {
                while (((c = sadrzaj.read()) != -1)) {
                    System.out.print((char) c);
                }
            }

        } else {
            System.out.println("Sadržaj nije dostupan");
        }
    }
}
