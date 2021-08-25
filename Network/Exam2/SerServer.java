package Network.Exam2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SerServer {
    public static void main(String[] args) {

        ServerSocket s =null;


        try {
            s = new ServerSocket(5433);

        } catch (IOException e) {
            
        }
        while(true) {
            try {
                System.out.println("서버 실행중...");
                Socket s1;

                s1 = s.accept();
                OutputStream out = s1.getOutputStream();
                ObjectOutputStream dos = new ObjectOutputStream(out);



                Employee p =new Employee("Kim", "Seoul", "990219", "01052648170");

                dos.writeObject(p);

                dos.close();
                s1.close();


            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }



            
            
        }
        
    }

    
}
