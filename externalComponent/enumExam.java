package externalComponent;


public class enumExam {
    public static void main(String[] args) {

        System.out.println(enumExam.day.SUN);

        System.out.println(enumExam.day.SUN.ordinal());
        System.out.println(enumExam.day.MON.ordinal());

        day enu =  enumExam.day.SUN;
        switch (enu) {
            case SUN : System.out.println("SUNDAY");
            case MON : System.out.println("MONDAY");
        }




    }
    public enum day {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }
    
}
