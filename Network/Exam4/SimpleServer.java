package Network.Exam4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class SimpleServer {
    public static void main(String[] args) {
        BufferedReader br_out;
        BufferedWriter bw;
        PrintWriter pw = null;
        OutputStream os ;
        ServerSocket serverSocket;  //server소켓 생성
        Socket s1 = null;

        String outMessage = null;

        try {
            serverSocket = new ServerSocket(5434);  //포트로 접속
            System.out.println("서버 실행중...");

            s1 = serverSocket.accept();  //socket 생성 > 클라이언트와 통신
            os = s1.getOutputStream();

            RecvThread rThread = new RecvThread(s1);
            rThread.start();

            br_out = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(os));

            pw = new PrintWriter(bw, true);
            pw.println("server : 접속을 환영합니다.");

            while(true) {
                outMessage = br_out.readLine();
                if(outMessage.equals("exit")) {
                    break;

                }
                pw.println("Server : " + outMessage);

            }
            pw.close();
            s1.close();

            if(rThread.isAlive()) {
                rThread.interrupt();
                rThread = null;
                
            }

            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(0);

        } 
        
    }
    
}
