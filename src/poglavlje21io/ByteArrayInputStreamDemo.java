package poglavlje21io;

import java.io.ByteArrayInputStream;
import java.io.IOException;


public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException{
        String tmp = "abcdefghijklmnoprstuvwxyz";
        byte b[] = tmp.getBytes();
        
        ByteArrayInputStream stream1 = new ByteArrayInputStream(b);
        ByteArrayInputStream stream2 = new ByteArrayInputStream(b, 0, 3);
    }
}
