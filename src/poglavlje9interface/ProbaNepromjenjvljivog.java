package poglavlje9interface;

public class ProbaNepromjenjvljivog {

    public static void main(String[] args) {

        NepromjenjivStek mojStek1 = new NepromjenjivStek(5);
        NepromjenjivStek mojStek2 = new NepromjenjivStek(8);

        //postavlja nekoliko brojeva na stek
        for (int i = 0; i < 5; i++) {
            mojStek1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mojStek2.push(i);
        }
        //skida postavljene brojeve sa steka
        System.out.println("Stek mojStek1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mojStek1.pop());
        }
        System.out.println("Stek mojStek2:");
        for (int i = 0; i < 8; i++) {
            System.out.println(mojStek2.pop());
        }
    }
}
