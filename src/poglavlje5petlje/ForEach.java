package poglavlje5petlje;

//Primjer for-each verzije petlje for na dvodimenzionalni niz
public class ForEach {

    public static void main(String[] args) {
        int zbir = 0;
        int brojevi[][] = new int[3][5];

        //brojevima dodjeljujemo vrijednost
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                brojevi[i][j] = (i + 1) * (j + 1);
            }
        }

        //Upotreba for-each petlje for za prikazivanje i sabiranje brojeva
        for (int x[] : brojevi) {
            for (int y : x) {
                System.out.println("Broj je: " + y);
                zbir += y;
            }
        }
        System.out.println("Zbir iznosi: " + zbir);
    }

}
