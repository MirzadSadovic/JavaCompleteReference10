package poglavlje9interface;

//Pristupanje steku preko promjenjive tipa interfejs
public class ProbaSteka3 {

    public static void main(String[] args) {

        CjelobrojniStek mojStek; //promjenjiva tipa interfejs
        PromjenljiviStek ps = new PromjenljiviStek(5);
        NepromjenjivStek ns = new NepromjenjivStek(8);

        mojStek = ps; //punjenje promjenljivog steka - postavljanje nekoliko brojeva na stek
        for (int i = 0; i < 12; i++) {
            mojStek.push(i);
        }
        mojStek = ns; //punjenje nepromjenljivog steka
        for (int i = 0; i < 8; i++) {
            mojStek.push(i);
        }

        mojStek = ps;
        System.out.println("Vrijednost na promjenljivom steku:");
        for (int i = 0; i < 12; i++) {
            System.out.println(mojStek.pop());
        }
        mojStek = ns;
        System.out.println("Vrijednost na nepromjenljivom steku:");
        for (int i = 0; i < 8; i++) {
            System.out.println(mojStek.pop());
        }
    }

}
