package poglavlje5petlje;

//Upotreba naredbe continue sa ciljnom oznakom
public class ContinueWithLabel {

    public static void main(String[] args) {

        
   spoljna: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue spoljna;
                }
                System.out.print(" " + i * j);
            }
        }
        System.out.println();
    }

}
