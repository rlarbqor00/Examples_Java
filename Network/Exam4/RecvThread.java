package Network.Exam4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class RecvThread extends Thread { 
    InputStream is;
    BufferedReader br_in;
    ServerSocket serverSocket;
    Socket socket =null;

    String inMessage = null;

    public RecvThread(Socket s) {
        this.socket =  s;

    }
    public void run() {
        try {
            is = socket.getInputStream();
            br_in = new BufferedReader(new InputStreamReader(is));

            while(true) {
                inMessage = br_in.readLine();
                System.out.println(inMessage);
                
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    
    
}
