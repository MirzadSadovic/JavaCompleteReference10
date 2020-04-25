package poglavlje17znakovninizovi;

//Ilustracija dobijanja informacija o objektima u toku izvršavanja programa

class X {
    int a;
    float b;
}
class Y extends X {
    double c;
}

public class RunTimeTypeInformation {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> classObject;
        
        classObject = x.getClass(); // referenca ne objekat tipa Class
        System.out.println("x je objekat tipa: " + classObject.getName());
        
        classObject = y.getClass(); //referenca na objekat tipa Class
        System.out.println("y je objekat tipa: " + classObject.getName());
        classObject = classObject.getSuperclass();
        System.out.println("Natklasa klase Y je " + classObject.getName());
    }
}
