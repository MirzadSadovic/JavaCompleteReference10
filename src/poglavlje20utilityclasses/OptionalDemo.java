package poglavlje20utilityclasses;

//Ilustracija upotrebe više metoda klase Optional<T>

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> bezVrijednosti = Optional.empty();
        
        Optional<String> imaVrijednost = Optional.of("ABCDEFG");
        
        if(bezVrijednosti.isPresent()){
            System.out.println("Ovo se neće prikazati");
        }else{
            System.out.println("bezVrijednosti ne sadrži ništa");
        }
        
        if(imaVrijednost.isPresent()){
            System.out.println("imaVrijednost sadrži vrijednosti: " + imaVrijednost.get());
        }
        
        String podrVrijednost = bezVrijednosti.orElse("Podrazumjevana vrijednost");
        System.out.println(podrVrijednost); 
    }
}
