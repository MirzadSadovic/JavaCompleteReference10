package poglavlje7metodeiklase;

//Ilustracija upotrebe argumenata promjenjive duzine
public class Vararg {

    //vaTest() koristi vararg
    static void vaTest(int... v) {
        System.out.println("Broj argumenata: " + v.length + " Sadržaj:");

        for (int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //vaTest() se moze pozvati sa promjenjivim brojem argumenata
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
