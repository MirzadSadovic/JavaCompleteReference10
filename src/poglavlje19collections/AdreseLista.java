package poglavlje19collections;

import java.util.LinkedList;

public class AdreseLista {

    public static void main(String[] args) {
        LinkedList<Adresa> linkedAddress = new LinkedList<Adresa>();

        //Dodavanje elemenata u linkedListu
        linkedAddress.add(new Adresa("Mirzad Sadovic", "Gornji velesici, 291", "71000", "Sarjevo", "BiH"));
        linkedAddress.add(new Adresa("Elma Sadovic", "Gornji velesici, 291", "71000", "Sarjevo", "BiH"));
        linkedAddress.add(new Adresa("Uma Sadovic", "Gornji velesici, 291", "71000", "Sarjevo", "BiH"));

        //Prikazivanje sadrzaja liste
        for (Adresa a : linkedAddress) {
            System.out.println(a + "\n");
        }
        System.out.println();
    }
}
