package poglavlje8inheritance.abstraction;


public class Pravougaonik extends Oblik{

    public Pravougaonik(double a, double b) {
        super(a, b);
    }

    @Override
    double povrsina() {
        System.out.println("Površina pravougaonika");
        return dim1 * dim2;
    }
    
}
