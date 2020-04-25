package poglavlje17znakovninizovi;

//Program čeka da se Notepad završi.

public class ExecDemo2 {
    
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Greška pri pokretanju programa Notepad.");
        }
        System.out.println("Izlazna vrijednost programa Notepad je " + p.exitValue());
    }
}
