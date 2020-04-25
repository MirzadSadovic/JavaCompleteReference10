package poglavlje17znakovninizovi;

//Upotreba metode trim() za obradu komandi.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrimDemo {
    public static void main(String[] args) throws IOException {

        //Pravljenje objekta tipa BufferedReader pomoću System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        System.out.println("Unesite 'kraj' za kraj reda.");
        System.out.println("Unesite ime države:");
        
        do{
            str = br.readLine();
            str = str.trim();  //uklanja prazna mjesta
            switch (str) {
                case "Grčka":
                    System.out.println("Glavni grad je Atina");
                    break;
                case "Mađarska":
                    System.out.println("Glavni grad je Budimpešta");
                    break;
                case "Češka":
                    System.out.println("Glavni grad je Prag");
                    break;
                case "Francuska":
                    System.out.println("Glavni grad je Paris");
                    break;
            }
        }while(!str.equals("kraj"));
    }
}
