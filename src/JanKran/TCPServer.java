package JanKran;

// เปิด Comment เพื่อใช้งาน

// import java.net.*;
// import java.io.*;

// class TCPServer{
//      public static void main (String[] args) {
//         try{
//             ServerSocket serverSocket = new ServerSocket(1111);
//             Socket socket = serverSocket.accept();                
//             DataInputStream in = new DataInputStream(socket.getInputStream());
//                     DataOutputStream out = new DataOutputStream(socket.getOutputStream());

//             //Received data
//                 System.out.println("Received: "+ in.readUTF());
//                 //send data
//                 out.writeUTF("ACK 220 OK!!");  

//         }catch(Exception e){
//             System.out.println("ERROR");
//         }
//      }
// }