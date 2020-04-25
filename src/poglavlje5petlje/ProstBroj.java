package poglavlje5petlje;

//Ispituje da li je broj prost
public class ProstBroj {
    public static void main(String[] args) {
        int broj;
        boolean prost;
        
        broj = 14;
        
        if(broj <2) prost = false;
        else prost = true;
        
        for(int i = 2; i <= broj/i; i++){
            if((broj % i) == 0){
            prost = false;
            break;
            
        }
        }
        if(prost) System.out.println("Prost broj");
        else System.out.println("Nije prost broj");
    }
}
