package poglavlje13io;

import java.io.*;

public class ObradaTeksta {

    public static void main(String[] args) throws IOException {

        //Izrada objekta tipa BufferedReader na osnovu objekta System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Unesite više redovs teksta.");
        System.out.println("Upišite 'stop' za kraj.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }
        System.out.println("\nEvo vaše datoteke:");
        //prikazivanje redova
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
