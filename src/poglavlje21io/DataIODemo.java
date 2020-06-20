package poglavlje21io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataIODemo {
    public static void main(String[] args) throws IOException{
        
        //Podatke prvo upisujemo u datoteku
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dos.writeDouble(98.6);
            dos.writeInt(1000);
            dos.writeBoolean(true);
        }catch(FileNotFoundException e){
            System.out.println("Nemogu otvoriti izlaznu datoteku.");
            return;
        }catch(IOException e){
            System.out.println("I/O Error " + e);
        }
        
        //Sada učitavamo podatke i z datoteke
        try(DataInputStream dis = new DataInputStream(new FileInputStream("Test.dat"))){
            double d = dis.readDouble();
            int i = dis.readInt();
            boolean b = dis.readBoolean();
            
            System.out.println("Ovo su vrijednosti: " + d + " : " + i + " : " + b);
        }catch(FileNotFoundException e){
            System.out.println("Nemogu da otvorim ulaznu datoteku.");
        }catch(IOException e){
            System.out.println("I/O Error " + e);
        }
    }
 
}
