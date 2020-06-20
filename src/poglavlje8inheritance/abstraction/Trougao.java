package poglavlje8inheritance.abstraction;

public class Trougao extends Oblik{

    public Trougao(double a, double b) {
        super(a, b);
    }

    @Override
    double povrsina() {
        System.out.println("Površina trougla");
        return dim1 * dim2 / 2;
    }
    
}
