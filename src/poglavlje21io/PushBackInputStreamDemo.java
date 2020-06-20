package poglavlje21io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackInputStreamDemo {

    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
        byte buf[] = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;

        try (PushbackInputStream pushbackInputStream = new PushbackInputStream(in)) {
            while ((c = pushbackInputStream.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = pushbackInputStream.read()) == '=') {
                            System.out.print(".jedn.");
                        } else {
                            System.out.print("<-");
                            pushbackInputStream.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("IO Error" + e);
        }
    }
}
