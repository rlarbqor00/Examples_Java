package etc;

public class StudentData {
    String name;
    String num;
    int eng;
    int kor;
    int total;

    public StudentData() {
        
    }

    public StudentData(String name, String num, int eng, int kor) {
        this.name=name;
        this.num = num;
        this.eng=eng;
        this.kor=kor;

    }
    public String getName() {
        return name;

    }
    public String getNumm() {
        return num;

    }
    
    
}
