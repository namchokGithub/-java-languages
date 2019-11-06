package JanKran;

import java.net.*;
import java.io.*;

class TCPClient{
 public static void main (String[] args) {
 	Socket socketClient;
	try{
            // socketClient = new Socket(args[0], 2222); // (ip,port)
            socketClient = new Socket("10.80.82.247", 1111); // (ip,port)
            DataInputStream in = new DataInputStream(socketClient.getInputStream());
            DataOutputStream out = new DataOutputStream(socketClient.getOutputStream());

	    //send data
            out.writeUTF("Hello Namchok");
	    //Received data
	    System.out.println("Received: "+ in.readUTF());

        }catch(Exception e){
            //
        }
 }
}