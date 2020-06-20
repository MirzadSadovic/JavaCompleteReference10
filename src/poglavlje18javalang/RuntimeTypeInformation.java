package poglavlje18javalang;

//Ilustracija dobijanja informacija o objektima tokom izvrsavanja programa

class X {
    int a;
    float b;
}

class Y extends X{
    double c;
}

public class RuntimeTypeInformation {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> classObject;
        
        classObject = x.getClass(); //referenca na objekat tpa Class
        System.out.println("x je objekat tipa: " + classObject.getName());
        
        classObject = y.getClass(); //referenca na objekat tpa Class
        System.out.println("y je objekat tipa: " + classObject.getName());
        classObject = classObject.getSuperclass();
        System.out.println("Natklasa klase y je " + classObject.getName());
    }
}
