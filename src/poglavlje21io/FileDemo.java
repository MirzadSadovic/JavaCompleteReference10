package poglavlje21io;

import java.io.File;

public class FileDemo {

    static void p(String s){
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        File f1 = new File("./zavrsni.txt");
        
        p("Ime datoteke: " + f1.getName());
        p("Putanja: " + f1.getPath());
        p("Naddirektorij: " + f1.getParent());
        p(f1.exists() ? "postoji" : "ne postoji");
        p(f1.canWrite() ? "za upisivanje " : "nije za upisivanje");
        p(f1.canRead() ? "za čitanje" : "nije za čitanje");
        p((f1.isDirectory() ? "jeste" : "nije") + " direktorij");
        p((f1.isFile() ? "obična" : "specijalna") + " datoteka");
        p(f1.isAbsolute() ? "apsolutna" : "nije apsolutna");
        p("Datoteka posljednji put izmjenjena: " + f1.lastModified());
        p("Veličina datoteke: " + f1.length()+ " byte");
    }
}
