package poglavlje14generickitipovi;


public class Gen <T> {
    T ob; //deklaracija objekta tipa T

    public Gen(T o) {
        ob = o;
    }
    T vratiOb(){
        return ob;
    }
    void prikaziTip(){
        System.out.println("Tip T je " + ob.getClass().getName());
    }
}
