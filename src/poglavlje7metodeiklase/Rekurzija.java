package poglavlje7metodeiklase;

class Faktorijel {

    //ovo je rekurzivna metoda
    int faktorijel(int n) {
        int rezultat;

        if (n == 1) {
            return 1;
        }
        rezultat = faktorijel(n - 1) * n;
        return rezultat;
        
    }    
}

//Faktorijel broja N je proizvod svih brojeva izmedju 1 i N. npr faktorijel broja 3 je 1x2x3 = 6;
public class Rekurzija {
    public static void main(String[] args) {
        Faktorijel f = new Faktorijel();
        
        System.out.println("Faktorijel broja 3 je " + f.faktorijel(3));
        System.out.println("Faktorijel broja 3 je " + f.faktorijel(4));
        System.out.println("Faktorijel broja 3 je " + f.faktorijel(5));
    }
}
