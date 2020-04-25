package poglavlje14generickitipovi;

public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<Integer>(88);
        iOb.prikaziTip();
        
        int v = iOb.vratiOb();
        System.out.println("vrijednost: " + v);
        
        System.out.println();
        
        Gen<String> strOb = new Gen<String>("Testiranje generičkih tipova");
        strOb.prikaziTip();
        
        String str = strOb.vratiOb();
        System.out.println("vrijednost: " + str );
         
    }
}
