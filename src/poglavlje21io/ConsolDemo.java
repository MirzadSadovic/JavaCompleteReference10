package poglavlje21io;

import java.io.Console;

public class ConsolDemo {

    public static void main(String[] args) {
        String str;
        Console console;

        //Referenca na postojeći konzolu
        console = System.console();
        //ako konzola nije na raspolaganju , izlaz
        if (console == null) {
            return;
        }

        //Učitavanje znakova i njihovo prikazivanje
        str = console.readLine("Upišite nekoliko znakova: ");
        console.printf("Upisali ste sljedeće znakove: %s\n", str);
    }
}
