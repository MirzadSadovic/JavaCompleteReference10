package poglavlje15lambda;
//Ilustracija referenciranja na statičku metodu

class MojeStringOp {  //Ova klasa definiše statičku metodu strObrni()

    static String strObrni(String str) { //Statička metoda koja obrće slova u tekstu
        String rezultat = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            rezultat += str.charAt(i);
        }
        return rezultat;
    }
}

//Ova metoda ima funkcionalni interfejs kao tip svog prvog parametra, te joj se moze prslijediti svaka instanca
//tog interfejsa, uključujući i referenca na metodu
public class ReferencaNaStatickeMetodeDemo {

    static String stringOp(StringFunkc sf, String s) {
        return sf.funkcija(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda izrazi pojačavaju Javu";
        String outStr;

        //Ovdje se referenca na statičku metodu strObrni prosljeđuje metodi stringOp().
        outStr = stringOp(MojeStringOp::strObrni, inStr);

        System.out.println("Izvorni tekst: " + inStr);
        System.out.println("Obrnut tekst: " + outStr);
    }
}
