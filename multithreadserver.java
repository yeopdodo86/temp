
package network2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class multithreadserver {

 public static void main(String[] args) throws Exception {
   
   try{
   ServerSocket  server = new ServerSocket(9090);
   while(true){
     System.out.print("waiting");
     Socket socket = server.accept();
     System.out.print("client connected");
ClientThread clientThread = new ClientThread(socket);
clientThread.start();



   }

   }catch(Exception e){
    e.printStackTrace();
   }
 }
}
