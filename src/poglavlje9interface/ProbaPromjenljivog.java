package poglavlje9interface;


public class ProbaPromjenljivog {
    
    public static void main(String[] args) {

        PromjenljiviStek mojStek1 = new PromjenljiviStek(5);
        PromjenljiviStek mojStek2 = new PromjenljiviStek(8);

        //ove petlje cine da svaki stek raste
        for (int i = 0; i < 12; i++) mojStek1.push(i);  
        for (int i = 0; i < 20; i++) mojStek2.push(i);
        
        System.out.println("Stek mojStek1:");
        for (int i = 0; i < 12; i++) {
            System.out.println(mojStek1.pop());
        }
        System.out.println("Stek mojStek2:");
        for (int i = 0; i < 20; i++) {
            System.out.println(mojStek2.pop());
        }
    }
}
