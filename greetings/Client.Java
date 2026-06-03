//Client.java File
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.BufferedReader;
import.java.io.InputStreamReader;

public class Client{
    public static void main(String[] args) {
        try {
         System.out.println("Connecting to Server..");
         Socket socket = new Socket("127.0.0.1", 5000);
         System.out.println("Successfully Connected!");
         
         //creating input and output streams
         InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
         BufferedReader reader = new BufferedReader(intputStreamReader);
         PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
         
        //implementing methods to exchange data
        Sysem.out.println("Hey, please enter your name:");
        writer.println(userInput);
        System.out.println("Server:" + reader.readLine());

         socket.close();
         reader.close();
         writer.close();
         } catch (IOException e) {
        System.out.println(e.getMessage());
        }
    }
}
