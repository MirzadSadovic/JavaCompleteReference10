package poglavlje17znakovninizovi;

//Ilustracija upotrebe metode exec
public class ExecDemo {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
        } catch (Exception e) {
            System.out.println("Greška pri pokretanju programa Notepad.");
        }
    }
}
