package poglavlje23umrezavanje;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HttpURLDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        URL url = new URL("http://www.google.com");
        
        HttpURLConnection hurlc = (HttpURLConnection)url.openConnection();
        
        //Prikazivanje načina slanja zahtjeva
        System.out.println("Zahtjev je poslat metodom " + hurlc.getRequestMethod());
        
        //Prikazivanje odzivnog koda od servera
        System.out.println("Odzivni kod je " + hurlc.getResponseCode());
        
        //Prikazivanje teksta odzivne poruke
        System.out.println("Odzivna poruka glasi "  + hurlc.getResponseMessage());
        
        //Formiranje liste polja zaglavlje i skupa ključeva zaglavlja
        Map<String, List<String>> hdrMap = hurlc.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        
        System.out.println("\nSadržaj zaglavlja");
        
        //Prikazivanje svih ključeva i vrijednosti u zaglavlju
        for(String key : hdrField){  //hdrField.stream().forEach((key) -> {
            System.out.println("Ključ: " + key + " Vrijednost: " + hdrMap.get(key));
        }
    }
}
