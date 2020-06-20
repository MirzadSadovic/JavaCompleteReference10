package poglavlje23umrezavanje;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddresDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Addres = InetAddress.getLocalHost();
        System.out.println(Addres);
        
        Addres = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Addres);
        
        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for(int i =0; i < SW.length; i++){
            System.out.println(SW[i]);
        }
    }
}
