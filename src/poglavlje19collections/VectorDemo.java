package poglavlje19collections;

//Ilustracija raznih operacija s objektom tipa Vector
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        //Početna veličina je 3, povećanje (increment) je 2
        Vector<Integer> v = new Vector<Integer>(3, 2);

        System.out.println("Početna veličina: " + v.size());
        System.out.println("Početni kapacitet: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Kapacitet nakon četiri unijete vrijednosti: " + v.capacity());

        v.addElement(5);
        System.out.println("Tekući kapacitet: " + v.capacity());

        v.addElement(6);
        v.addElement(7);
        System.out.println("Tekući kapacitet: " + v.capacity());

        v.addElement(9);
        v.addElement(10);
        System.out.println("Tekući kapacitet: " + v.capacity());

        v.addElement(11);
        v.addElement(12);

        System.out.println("Prvi element: " + v.firstElement());
        System.out.println("Posljednji element: " + v.lastElement());

        if (v.contains(3)) {
            System.out.println("Vektor sadrži 3.");
        }
        //Pojedinačno pristupanje elementima vektora
        Enumeration<Integer> vEnum = v.elements(); //Stara verzija!!! U novim je upotreba Iteratora.

        System.out.println("\nElementi u vektoru:");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
