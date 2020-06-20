package poglavlje21io;


public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Evo nekoliko brojeva u različitim formatima.\n");
        
        System.out.printf("Razni formati cijelih brojeva");
        System.out.printf("%d %(d %+d %05d\n", 3,-3,3,3);
        
        System.out.println();
        System.out.printf("Podrazumjevani format broja sa pokretnim zarezom: %f\n", 1234567.123);
        System.out.printf("Ispis brojeva sa pokretnim zarezom s grupama razdvojenim zarezima: %,f\n", 1234567.123);
        System.out.printf("Podrazumjevani format negativnih brojeva sa pokretnim zarezom: %,f\n", -1234567.123);
        System.out.printf("Opcija za ispisivanje negativnih brojeva s pokretnim zarezom: %, (f\n", 1234567.123);
        
        System.out.println();
        
        System.out.printf("Poravnanje pozitivnih i negativnih brojeva:\n");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);
    }
}
