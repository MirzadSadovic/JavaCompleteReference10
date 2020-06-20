package poglavlje8inheritance.abstraction;

public class AbstractDemo {

    public static void main(String[] args) {
        // Oblik oblik = new Oblik(10, 10) {  Ovo nemoze!!!
        Pravougaonik pravougaonik = new Pravougaonik(9, 5);
        Trougao trougao = new Trougao(10, 8);

        Oblik refOblik;  //Ovo moze jer se ne pravi objekt, samo referenca na klasu Oblik

        refOblik = pravougaonik;
        System.out.println(refOblik.povrsina());

        refOblik = trougao;
        System.out.println(refOblik.povrsina());
    }
}
