package poglavlje18javalang;


public class ProcessBuilderDemo {
    public static void main(String[] args) {
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", "datoteka za obradu");
            processBuilder.start();
        }catch(Exception exception){
            System.err.println("Greska pri pokretanju notepada " + exception);
        }
    }
}
