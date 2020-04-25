package poglavlje15lambda;

//Upotreba ugrađenog funkcionalnog interfejsa Functin.
import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {

        //Ovaj blok lambda izraz izračunava faktorijel vrijednosti tipa int.
        Function<Integer, Integer> faktorijel = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Faktorijel od 3 je " + faktorijel.apply(3));
        System.out.println("Faktorijel od 5 je " + faktorijel.apply(5));
    }
}
