package poglavlje21io;

import java.io.File;

public class DirectoryListDemo {

    public static void main(String[] args) {
        String directory = "../JavaCompleteReference10";
        File f1 = new File(directory);

        if (f1.isDirectory()) {
            System.out.println("Direktorij " + directory);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(directory + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " je direktorij");
                } else {
                    System.out.println(s[i] + " je datoteka");
                }
            }
        } else {
            System.out.println(directory + " nije direktorij");
        }
    }
}
