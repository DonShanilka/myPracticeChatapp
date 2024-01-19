package lk.ijse;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {

            /*ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();
            System.out.println("Client Accept");

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String massage = "";
            String reply = "";

            while (!massage.equals("finish")){
                massage = dataInputStream.readUTF();
                System.out.println("Client" + massage);

                reply = bufferedReader.readLine();

                dataOutputStream.writeUTF(reply);
                dataOutputStream.flush();
            }

            dataInputStream.close();
            dataOutputStream.close();
            bufferedReader.close();
            socket.close();*/

            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();
            System.out.println("Accept");

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String massage = "";
            String reply = "";

            while (!massage.equals("exit")){
                massage = dataInputStream.readUTF();
                System.out.println("Client " + massage);

                reply = bufferedReader.readLine();

                dataOutputStream.writeUTF(reply);
                dataOutputStream.flush();

            }

            dataInputStream.close();
            dataOutputStream.close();
            bufferedReader.close();
            socket.close();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
