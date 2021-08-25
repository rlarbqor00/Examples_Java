package Network.Exam4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        BufferedReader br_in;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        OutputStream os;
        //serversocket을 생성하지 않는다. 클라이언트이기 때문

        String outMessage = null;

        Socket s1;
        try {
            s1 = new Socket("127.0.0.1", 5434);
            os = s1.getOutputStream();
            RecvThread rThread = new RecvThread(s1);
            rThread.start();

            br_in = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(os));

            pw = new PrintWriter(bw, true);

            while(true) {
                outMessage = br_in.readLine();
                if(outMessage.equals("exit")) {
                    break;

                }
                pw.println("Client : " + outMessage);

            }
            pw.close();
            s1.close();

            if(rThread.isAlive()) {
                rThread.interrupt();
                rThread = null;

            }


        }  catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(0);

        }
        
        

    }
    
}
