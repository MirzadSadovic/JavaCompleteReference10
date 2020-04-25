package poglavlje9interface;

public class NepromjenjivStek implements CjelobrojniStek {

    private final int stk[];
    private int vrh;

    //rezervise memoriju za stek i inicijalizuje ga
    NepromjenjivStek(int velicina) {
        stk = new int[velicina];
        vrh = -1;
    }

    //postavlja jednu stavku na stek
    @Override
    public void push(int stavka) {
        if (vrh == stk.length - 1) {//upotreba clana length
            System.out.println("Stek je popunjen.");
        } else {
            stk[++vrh] = stavka;
        }
    }

    //skida jednu stavku sa steka
    @Override
    public int pop() {
        if(vrh < 0){
            System.out.println("Stek je prazan.");
            return 0;
        }else{
            return stk[vrh--];
        }
    }

}
