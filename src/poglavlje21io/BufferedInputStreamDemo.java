package poglavlje21io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

    public static void main(String[] args) {
        String s = "Ovo je &copy; simbol autorskih prava " + "ali ovo &copy nije.\n";
        byte buf[] = s.getBytes();

        ByteArrayInputStream arrayInput = new ByteArrayInputStream(buf);
        int c;
        boolean oznacen = false;

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(arrayInput)) {
            while ((c = bufferedInputStream.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!oznacen) {
                            bufferedInputStream.mark(32);
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
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if (oznacen) {
                            oznacen = false;
                            bufferedInputStream.reset();
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
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
