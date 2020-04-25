package poglavlje19collections;

//Ilustruje upotrebu klase Arrays

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        //Pravljenje i inicijalizpvanje niza
        int niz[] = new int[10];
        for (int i = 0; i < 10; i++) {
            niz[i] = -3 * i;
        }
        //Prikazivanje, sortiranje i ponovno prikazivanje sadržaja niza
            System.out.print("Prvobitni sadržaj: ");
            prikazi(niz);
            Arrays.sort(niz);
            System.out.print("Uređen: ");
            prikazi(niz);
            
            //Popunjavanje i prikazivanje niza
            Arrays.fill(niz, 2, 6, -1);
            System.out.print("Poslije primjene metode fill(); ");
            prikazi(niz);
            
            //Sortiranje i prikazivanje niza
            Arrays.sort(niz);
            System.out.print("Poslije ponovnog sortiranja: ");
            prikazi(niz);
            
            //Binarno pretrazivanje vrijednosti -9
            System.out.print("Vrijednost -9 je na indexu ");
            int index = Arrays.binarySearch(niz, -9);
            System.out.println(index);
    }

    private static void prikazi(int[] niz) {
        for(int i : niz){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
