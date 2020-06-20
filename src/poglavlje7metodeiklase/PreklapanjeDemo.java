package poglavlje7metodeiklase;

class Preklapanje {
    void test() {
        System.out.println("Bez parametara");
    }
    //Preklopljena metoda sa jednim cjelobrojnim parametrom
    void test(int a){
        System.out.println("a: " + a);
    }
    //Preklopljena metoda sa dva cjelobrojna parametra
    void test(int a, int b){
        System.out.println("a i b : " + a + " " + b);
    }
    //Preklopljena metoda sa parametrom tipa double
    double test(double a){
        System.out.println("realan broj dvostruke tacnosti a: " + a);
        return a*a;
    }
}

public class PreklapanjeDemo {
    public static void main(String[] args) {

        Preklapanje object = new Preklapanje();
        double rezultat;
        
        //Pozivanje svih verzija metode test
        object.test();
        object.test(10);
        object.test(10, 20);
        rezultat = object.test(123.45);
        System.out.println("Rezultat metode object.test(123.15): " + rezultat);
    }
}
