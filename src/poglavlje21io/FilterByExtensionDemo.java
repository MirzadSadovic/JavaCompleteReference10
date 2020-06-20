package poglavlje21io;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByExtensionDemo implements FilenameFilter {

    String extension;

    public FilterByExtensionDemo(String extension) {
        this.extension = "." + extension;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(extension);
    }

}

class FiltriraniPrikaz {

    public static void main(String[] args) {
        String directory = "../JavaCompleteReference10";
        File f1 = new File(directory);
        FilenameFilter filter = new FilterByExtensionDemo("gif");
        String s[] = f1.list(filter);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
