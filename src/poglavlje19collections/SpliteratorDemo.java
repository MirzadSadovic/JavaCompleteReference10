package poglavlje19collections;

//Jednostavan primjer upotrebe interfejsa Spliterator
import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        //Formiramo listu vrijednosti tipa Double
        ArrayList<Double> vals = new ArrayList<>();

        //Popunjavamo listu vrijednostima
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //Pomoću metode tryAdvance() prikazujemo sadržaj liste vals
        System.out.println("Sadržaj liste vals: ");
        Spliterator<Double> split = vals.spliterator();
        while (split.tryAdvance((x) -> System.out.println(x))) {
        }
        System.out.println();

        //Formiramo novu listu za vrijednosti kvadratnih korijena.
        split = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (split.tryAdvance((x) -> sqrs.add(Math.sqrt(x))));
        //Pomoću metode forEachRemaining() prikazujemo sadržaj liste sqrs.
        System.out.println("Sadržaj liste sqrs: ");
        split = sqrs.spliterator();
        split.forEachRemaining((x) -> System.out.println(x));
        System.out.println();
    }
}
