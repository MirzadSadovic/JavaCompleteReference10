package poglavlje23umrezavanje;

//Datagram demonstrate
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class WriteServer {

    public static int serverPort = 998;
    public static int clientPort = 999;
    public static int BUFFER_SIZE = 1024;
    public static DatagramSocket datagramSocket;
    public static byte buffer[] = new byte[BUFFER_SIZE];

    public static void Server() throws Exception {
        int index = 0;
        while (true) {
            int c = System.in.read();
            switch (c) {
                case -1:
                    System.out.println("Server je završio rad");
                    datagramSocket.close();
                    return;
                case '\r':
                    break;
                case '\n':
                    datagramSocket.send(new DatagramPacket(buffer, index, InetAddress.getLocalHost(), clientPort));
                    index = 0;
                    break;
                default:
                    buffer[index++] = (byte) c;
            }
        }
    }
    
    public static void Klijent() throws IOException{
        while(true){
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(p);
            System.out.println(new String(p.getData(), 0, p.getLength()));
        }
    }
    
    public static void main(String[] args) throws SocketException, Exception {
        if(args.length == 1){
            datagramSocket = new DatagramSocket(serverPort);
            Server();
        }else{
            datagramSocket = new DatagramSocket(clientPort);
            Klijent();
        }
    }
}
