package poglavlje7metodeiklase;

//Ilustracija upotrbe interne klase
class Spoljna {

    int spoljna_x = 100;

    void test() {
        Interna interna = new Interna();
        interna.prikazi();
    }

    //Ovo je inner klasa
    class Interna {
        void prikazi() {
            System.out.println("prikaz: spoljna_x = " + spoljna_x);
        }
    }
}

public class InnerClassDemo {

    public static void main(String[] args) {
        Spoljna spoljna = new  Spoljna();
        spoljna.test();
    }
}
