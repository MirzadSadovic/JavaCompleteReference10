package poglavlje14generickitipovi.dzokerskitip;

public class WildcardDemo {

    public static void main(String[] args) {

        Integer iBrojevi[] = {1, 2, 3, 4, 5};
        Statistics<Integer> iOb = new Statistics<Integer>(iBrojevi);
        double v = iOb.average();
        System.out.println("iOb average is: " + v);

        Double dBrojevi[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Statistics<Double> dOb = new Statistics<Double>(dBrojevi);
        double w = dOb.average();
        System.out.println("dOb average is: " + w);

        Float fBrojevi[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Statistics<Float> fOb = new Statistics<Float>(fBrojevi);
        double x = fOb.average();
        System.out.println("fOb average is: " + x);

        //Utvrđuje koji nizovi imaju istu srednju vrijednost
        System.out.print("Srednje vrijednosti nizova iOb i dOb");
        if (iOb.sameAvg(dOb)) {
            System.out.println(" su jednake");
        } else {
            System.out.println(" se razlikuju");
        }
        System.out.print("Srednje vrijednosti nizova iOb i fOb");
        if (iOb.sameAvg(fOb)) {
            System.out.println(" su jednake");
        } else {
            System.out.println(" se razlikuju");
        }
    }
}
