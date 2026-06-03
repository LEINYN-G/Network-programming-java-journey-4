import java.io.IOException;
import java.net.Socket;

public class Client {
   public static void main(String[] args) {
    try {
      System.out.println("Connecting to server..");
      Socket socket = new Socket("127.0.0.1", 5000);  //to make the connection with a server we need a Socket connexn
      System.out.println("Successully Connected!");
      Socket.close();
     } catch(IOException e) {
     System.out.println(e.getMessage());
     }
    }
   }
