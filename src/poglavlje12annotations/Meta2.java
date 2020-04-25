package poglavlje12annotations;

//Prikaz svih anotacija pridruženih klasi i metodi

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {

    String description();
}

@What(description = "Klasa za testiranje anotacija")
@MyAnno(str = "Meta2", val = 99)

public class Meta2 {

    @What(description = "Metoda za testiranje anotacija")
    @MyAnno(str = "Testiranje", val = 100)
    public static void myMethod() {
        Meta2 ob = new Meta2();

        try {
            Annotation anotacije[] = ob.getClass().getAnnotations();

            //Prikazi sve anotacije pridruzene klasi Meta2.
            System.out.println("Sve anotacije klase Meta2:");
            for (Annotation a : anotacije) {
                System.out.println(a);
            }

            System.out.println();

            //Prikazi sve anotacije pridružene motodi myMethod
            Method m = ob.getClass().getMethod("myMethod");
            anotacije = m.getAnnotations();
            System.out.println("Sve anotacije metode myMethod:");
            for (Annotation a : anotacije) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException e) {
            System.out.println("Metoda nije pronađena");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
