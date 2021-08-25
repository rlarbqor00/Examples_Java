package ListExam;

import java.util.LinkedList;
import java.util.Scanner;

public class Exam1 {
    String fruit = null;
    Scanner sc = new Scanner(System.in);
    int status = 0;



    public void menu() {
        Exam1 test1 = new Exam1();

        System.out.println("1. 데이터 추가");
        System.out.println("2. 데이터 삭제");
        System.out.println("3. 종료 후 데이터 출력");

        int num = sc.nextInt();

        if(num == 1) {
            test1.inputFruit();

        } else if(num == 2) {
            test1.removefruit();

        } else if(num==3) {
            this.status = 3;
            
        }

        
    }

    public void  inputFruit() {
        
      
        System.out.println("추가 할 과일을 입력하세요 : ");
        String inputfruit = sc.next();
        
        this.fruit = inputfruit;

        System.out.println(fruit + " 추가");

        this.status = 0;

        
    }

    public void removefruit() {
        System.out.println("삭제할 데이터를 입력하세요 : ");
        String inputfruit = sc.next();

        this.fruit = inputfruit;

        System.out.println(fruit + "삭제");

        this.status = 1;


    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Exam1 test1 = new Exam1();
        
        while(test1.status == 3) {
            test1.menu();

             if(test1.status == 0) {
            list.add(test1.fruit);

        }    else if(test1.status == 1) {
            list.remove(test1.fruit);

        }

        }
        

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));

        }


        

        

        

    }
    
}
