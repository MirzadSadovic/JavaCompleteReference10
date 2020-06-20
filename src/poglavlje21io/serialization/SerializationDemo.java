package poglavlje21io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {

        //Serijalizovanje objekta
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serijalizacija"))) {
            MyClass object1 = new MyClass("Zdravo", -7, 2.7e10);
            System.out.println("object1: " + object1);
            objectOutputStream.writeObject(object1);

        } catch (IOException exception) {
            System.out.println("Izuzetak tokom serijalizacije: " + exception);
        }

        //Deserijalizovanje objekta
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serijalizacija"))) {
            MyClass object2 = (MyClass) objectInputStream.readObject();
            System.out.println("object2: " + object2);

        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Nije pronađena klasa: " + classNotFoundException);
            
        } catch (IOException exception) {
            System.out.println("Izuzetak tokom deserijalizacije: " + exception);
            System.exit(0);
        }
    }
}
