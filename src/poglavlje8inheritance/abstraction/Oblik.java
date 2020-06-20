package poglavlje8inheritance.abstraction;

//Upotreba apstraktnih metoda i klasa
public abstract class Oblik {
    
    double dim1;
    double dim2;

    Oblik(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double povrsina();  //Apstraktna metoda, koja se mora redefinisati u podklasi
}
