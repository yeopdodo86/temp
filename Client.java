package network2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

  public static void main(String[] args){
    try{
//      InetAddress serverAddress =  InetAddress.getAllByName("localhost");
      System.out.print("server ip address is = " + "127.0.0.1");
      Socket socket = new Socket("127.0.0.1", 9090);
      PrintWriter out = new PrintWriter(socket.getOutputStream());
      BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out.println("hello server im client");
      input.close();
      out.close();
      socket.close();
      
    }catch (Exception e){
        
    }
    
  }
}
