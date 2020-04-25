package poglavlje5petlje;

//Upotreba do-while petlje za izbor iz menija
public class DoWhileMeni {

    public static void main(String[] args) throws java.io.IOException {

        char izbor;

        do {
            System.out.println("Pomoć za:");
            System.out.println("   1. if");
            System.out.println("   2. switch");
            System.out.println("   3. while");
            System.out.println("   4. do-while");
            System.out.println("   5. for\n");
            System.out.println("Izaberite jedno:");
            izbor = (char) System.in.read();
        } while (izbor < '1' || izbor > '5');

        System.out.println("\n");

        switch (izbor) {
            case '1':
                System.out.println("Naredba if:\n");
                System.out.println("if(uslov) naredba;");
                System.out.println("else naredba;");
                break;
            case '2':
                System.out.println("Naredba switch:\n");
                System.out.println("switch(izraz) {");
                System.out.println("  case konstanta:");
                System.out.println("    niz naredbi");
                System.out.println("  break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Naredba while:\n");
                System.out.println("while(uslov) naredba;");
                break;
            case '4':
                System.out.println("Naredba do-while:\n");
                System.out.println("do {");
                System.out.println("  naredba;");
                System.out.println("} while (uslov);");
                break;
            case '5':
                System.out.println("Naredba for:\n");
                System.out.println("for(inicijalizacija; uslov; iteracija)");
                System.out.println(" naredba");
                break;
        }
    }
}
