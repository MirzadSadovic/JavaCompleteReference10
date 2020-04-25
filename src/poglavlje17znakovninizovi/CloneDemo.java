package poglavlje17znakovninizovi;

//Ilustracija upotrebe metode clone().
class Clone implements Cloneable {
    int a;
    double b;

    Clone test() {  //Ova metoda vraća klon objekta
        try {
            return (Clone) super.clone(); //Pozivanje metode clone() klase Object.
        } catch (CloneNotSupportedException e) {
            System.out.println("Kloniranje nije dopušteno");
            return this;
        }
    }
}
public class CloneDemo {

    public static void main(String[] args) {
        Clone x1 = new Clone();
        Clone x2;
        
        x1.a = 10;
        x1.b = 20.98;      
        x2 = x1.test();  //Kloniranje x1
        
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);

    }
}
