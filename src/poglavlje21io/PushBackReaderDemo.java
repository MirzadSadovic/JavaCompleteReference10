package poglavlje21io;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.PushbackReader;

public class PushBackReaderDemo {
    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
        char buf[] = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        CharArrayReader in = new CharArrayReader(buf);
        int c;

        try (PushbackReader pbReader = new PushbackReader(in)) {
            while ((c = pbReader.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = pbReader.read()) == '=') {
                            System.out.print(".jedn.");
                        } else {
                            System.out.print("<-");
                            pbReader.unread(c);
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
