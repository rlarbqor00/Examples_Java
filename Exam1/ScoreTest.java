package Exam1;

public class ScoreTest {
    public MyStudent calcTotal(String name, int kor, int eng) {
        MyStudent mystudent = new MyStudent();
        mystudent.name = name;
        mystudent.kor = kor;
        mystudent.eng = eng;
        mystudent.total = kor+eng;

        return mystudent;

    }
    public static void main(String[] args) {
        MyStudent lee, hong;

        ScoreTest sc = new ScoreTest();
        lee=sc.calcTotal("Hong", 100, 50);
        hong=sc.calcTotal("Park", 45, 30);

        System.out.println(lee.toString());
        System.out.println(hong);
    }
    
}
