package poglavlje21io;

import java.io.ByteArrayInputStream;


public class ResetDemo {
    public static void main(String[] args) {
        String podaci = "abc";
        byte b[] = podaci.getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(b);
        
        for(int i = 0; i < 2; i++){
            int c;
            while((c = input.read()) != -1){
                if(i == 0){
                    System.out.print((char)c);
                }else{
                    System.out.print(Character.toUpperCase((char)c));
                }
            }
            System.out.println();
            input.reset();
        }
    }
}
