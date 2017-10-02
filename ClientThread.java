package network2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientThread extends Thread{

  private Socket socket = null;
  
  public ClientThread(Socket socket){
    this.socket = socket;
  }
  public void run(){
    
    try{
     
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      out.println("hi client");
      BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          String clientInput = input.readLine();
      System.out.println(clientInput);
      input.close();
      out.close();
      socket.close();
      }catch(Exception e){
       e.printStackTrace();
      }
  }
}
