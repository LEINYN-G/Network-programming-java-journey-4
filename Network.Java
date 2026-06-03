//server.Java
import java.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
  public static void main(String[] args) {

  try{
   ServerSocket serverSocket = new ServerSocket(5000);    //Our app. will execute and communicate over port no. 5000
   System.out.println("Connecting to Client...");
   Socket socket = serverSocket.accept();           //the accept method is called by the server to validate an incoming request to the socket
   System.out.println("Successfully Connected!");

  socket.close();
  server.Socket.close();
}  catch(IOException e) /*we already had it*/ {
   System.out.println(e.getMessage());
   }
  }
 }
