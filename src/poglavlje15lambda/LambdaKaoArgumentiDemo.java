package poglavlje15lambda;

//Prosljeđivanje lambda izraza kao argumenta metode
interface StringFunkc {
    
    String funkcija(String n);
}

public class LambdaKaoArgumentiDemo {

    //Ova metoda ima funkcionalni interfejs kao tip svog prvog parametra.
    //To znači da joj se može proslijediti referenca na instancu tog intefejsa, 
    //uključujući i instancu koju je napravio lambda izraz
    //Drugi parametar je znakovni niz koji je predmet operacije
    static String stringOp(StringFunkc sf, String s) {
        return sf.funkcija(s);
    }
    
    public static void main(String[] args) {
        String inStr = "Lambda izrazi pojačavaju Javu";
        String outStr;
        System.out.println("Ovo je ulazni tekst: " + inStr);

        //Ovdje se metodi stringOp() prosljeđuje jednoizrazni lamda koji mijenja ulazni teks u velika slova
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Ulazni tekst velikim slovima: " + outStr);

        //Ovdje se prosljeđuje blok lamda izraz koji uklanja razmake.
        outStr = stringOp((str) -> {
            String rezultat = "";
            int i;
            
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    rezultat += str.charAt(i);
                }
            }
            return rezultat;
        }, inStr);
        System.out.println("Ulazni tekst bez razmaka: " + outStr);

        //Može se proslijediti i instanca StringFunkc koju je napravio neki raniji lambda izraz
        //Na primjer, nakon izvršavanja ove deklaracije, obrni referencira instancu StringFunkc.
        StringFunkc obrni = (str) -> {
            String rezultat = "";
            int i;
            
            for (i = str.length() - 1; i >= 0; i--) {
                rezultat += str.charAt(i);
            }
            return rezultat;
        };
        //Sada se obrni može proslijediti kao pravi parametar metodi stringOp()
        //budući da referencira objekat tipa StringFunkc.
        System.out.println("Obrnut ulazni tekst: " + stringOp(obrni, inStr));
    }
}
