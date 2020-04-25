package poglavlje17znakovninizovi;

//Redefinisanje metode clone().
class Klon implements Cloneable {
    int a;
    double b;

    @Override
    public Object clone() {  //Metoda clone() sada je redefinisana i javna
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Kloniranje nije dopušteno");
            return this;
        }
    }
}
public class CloneDemo2 {
    public static void main(String[] args) {
        Klon x1 = new Klon();
        Klon x2;
        
        x1.a = 10;
        x1.b = 20.98;
        x2 = (Klon) x1.clone(); //ovdje se metoda clone() poziva direktno
        
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}
