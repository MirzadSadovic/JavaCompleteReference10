package poglavlje19collections;

//Pristupanje elementima kolekcije pomocu for-each verzije petlje for.
//ali samo u smijeru u naprijed i nemoze se mijenjati sadržaj kolekcije 
//ako prolazimo kroz kolekciju sa for-each petljom.
import java.util.ArrayList;

public class ForEachDemo {

    public static void main(String[] args) {

        //Izrada kolekcije tipa ArrayList za cjelobrojne vrijednosti
        ArrayList<Integer> brojevi =  new ArrayList<>();
        
        //Dodavanje vrijednosti na listu
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);
        
        //Prikazivanje vrijednosti pomoću petlje for-each
        System.out.print("Sadržaj liste brojevi: ");
        for(int b : brojevi){
            System.out.print(b + " ");
        }
        System.out.println();
        
        //Sabiranje vrijednosti u petlji for-each
        int zbir = 0;
        for(int b : brojevi){
            zbir += b;
            
        }
        System.out.println("Zbir brojeva je: " + zbir);
    }
}
