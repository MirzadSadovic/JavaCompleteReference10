package poglavlje15lambda;

//Generisanje izuzetaka u lambda izrazu.

interface DoubleNizFunkc {
    double funkcija(double[] n) throws PrazanNizException;
}

class PrazanNizException extends Exception {
    PrazanNizException() {
        super("Prazan niz!");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws PrazanNizException{
        double[] vrijednost = {1.0, 2.0, 3.0, 4.0};
        
        //Ovaj blok lambda izraz izračunava prosjek niza vrijednosti tipa double.
        DoubleNizFunkc average = (n)->{
            double sum = 0;
            if(n.length ==0){
                throw new PrazanNizException();
            }
            for(int i =0; i< n.length; i++){
                sum += n[i];
            }
            return sum / n.length;
        };
        System.out.println("Prosjek je " + average.funkcija(vrijednost));
        
        //Ovo prouzrokuje izuzetak.
        //System.out.println("Prosjek je " + average.funkcija(new double[0]));
    }

}
