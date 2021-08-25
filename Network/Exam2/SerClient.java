package Network.Exam2;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class SerClient {
    public static void main(String[] args) {

        try {
            Socket s1 = new Socket("127.0.0.1", 5433);

            InputStream is = s1.getInputStream();
            ObjectInputStream dis = new ObjectInputStream(is);

            Employee p = (Employee)dis.readObject();

            System.out.println("name : " + p.getName());
            System.out.println("addr : " + p.getAddr());
            System.out.println("jumin : " + p.getJumin());
            System.out.println("phone : " + p.getPhone());

            dis.close();
            s1.close();



        }  catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
