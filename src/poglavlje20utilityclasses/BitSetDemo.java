package poglavlje20utilityclasses;

//Ilustracija upotrebe klase BitSet
import java.util.BitSet;

public class BitSetDemo {

    public static void main(String[] args) {
        BitSet bitovi1 = new BitSet(16);
        BitSet bitovi2 = new BitSet(16);
        
        //Postavljanje vrijednosti nekoliko bitova na 1
        for(int i = 0; i <16; i++){
            if((i%2) == 0){
                bitovi1.set(i);
            }
            if((i%5) != 0){
                bitovi2.set(i);
            }
        }       
        System.out.println("Početno stanje bitovi1: " + bitovi1);
        System.out.println("Početno stanje bitovi2: " + bitovi2);
        
        //konjukcija bitova (operacija AND)
        bitovi2.and(bitovi1);
        System.out.println("\nbitovi2 AND bitovi1: " + bitovi2);
        
        //disjunkcija bitova (operacija OR)
        bitovi2.or(bitovi1);
        System.out.println("\nbitovi2 OR bitovi1: " + bitovi2);
        
        //iskljuciva disjunkcija bitova (operacija XOR)
        bitovi2.xor(bitovi1);
        System.out.println("\nbitovi2 XOR bitovi1: " + bitovi2);
    }
}
