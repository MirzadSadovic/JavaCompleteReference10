package poglavlje9interface;

//Implementacija steka koji moze da raste
public class PromjenljiviStek implements CjelobrojniStek {

    private int stk[];
    private int vrh;

    //rezervise memoriju za stek i inicijalizuje ga
    public PromjenljiviStek(int velicina) {
        stk = new int[velicina];
        vrh = -1;
    }

    //Postavlja jednu stavku stek
    @Override
    public void push(int stavka) {
        //ako je stek pun, rezerviši memoriju za veći stek
        if (vrh == stk.length - 1) {
            int privremeni[] = new int[stk.length * 2]; //dupliraj veličinu
            for (int i = 0; i < stk.length; i++) privremeni[i] = stk[i];
                stk = privremeni;
                stk[++vrh] = stavka;
            
        } else {
            stk[++vrh] = stavka;
        }
    }

    //Skida jednu stavku sa steka
    @Override
    public int pop() {
        if (vrh < 0) {
            System.out.println("Stek je prazan.");
            return 0;
        } else {
            return stk[vrh--];
        }
    }

}
