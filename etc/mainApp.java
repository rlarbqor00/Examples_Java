package etc;

import java.util.Scanner;

import javax.swing.border.EmptyBorder;


public class mainApp {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        String intName = sc.next();
        
        System.out.println("번호 : ");
        String intNum = sc.next();
        
        System.out.println("영어 점수 : ");
        int engScore = sc.nextInt();
        
        System.out.println("국어 점수 : ");
        int korScore = sc.nextInt();

        StudentData stuDB = new StudentData(intName, intNum, engScore, korScore);

        // System.out.println(stuDB.name);
        // System.out.println(stuDB.num);
        // System.out.println(stuDB.eng);
        // System.out.println(stuDB.kor);
        stuDB.total = stuDB.kor+stuDB.eng;

        System.out.println(stuDB.total);






        

        
        
    }
    
}
