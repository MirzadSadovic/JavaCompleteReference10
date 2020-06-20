package poglavlje21io;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        String s = "Ovo je &copy; simbol autorskog prava " + "ali ovo &copy nije.\n";
        char buffer[] = new char[s.length()];
        s.getChars(0, s.length(), buffer, 0);

        CharArrayReader in = new CharArrayReader(buffer);
        int c;
        boolean oznacen = false;

        try (BufferedReader br = new BufferedReader(in)) {
            while ((c = br.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!oznacen) {
                            br.mark(32);
                            oznacen = true;
                        } else {
                            oznacen = false;
                        }
                        break;
                    case ';':
                        if (oznacen) {
                            oznacen = false;
                            System.out.print("(c)");
                        } else {
                            System.out.println((char) c);
                        }
                        break;
                    case ' ':
                        if (oznacen) {
                            oznacen = false;
                            br.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!oznacen) {
                            System.out.print((char) c);
                        }
                        break;
                }
            }
        } catch (IOException exception) {
            System.out.println("I/O greška " + exception);
        }
    }
}
