package poglavlje13io;

//Ucitavanje znakovnog niza s konzole pomocu klase BufferedReader.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnosRedova {

    public static void main(String[] args) throws IOException {

        //Izrada objekta BufferedReader na osnovu objekta System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        System.out.println("Unesite više redovs teksta");
        System.out.println("Upišite 'stop' za kraj");
        
        do{
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
    }
}
