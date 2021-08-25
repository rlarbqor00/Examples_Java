package DataStructure;

public class MyStudent {
    String name;
    int grade;

    public MyStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }
    public MyStudent() {
        this("Oh", 3);

    }
    public String getName() {
        return name;

    }
    public void setName() {
        this.name = name;

    }
    public int getGrade() {
        return grade;

    }
    public void setGrade() {
        this.grade = grade;

    }
    public String toString() {
        return "학생 이름은 : " +name + ", 학년은 : " + grade;
    }

    
}
