package poglavlje13io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Upotreba objekta tipa BufferedReader za citanje znakova sa konzole
public class UnosZnakova {

    public static void main(String[] args) throws IOException {

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Unosite znakove, 'q' je za kraj.");

        //čitanje znakova 
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
