package ListExam;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties p = new Properties();

        p.setProperty("name", "hong");
        p.setProperty("age", "18");
        p.setProperty("job", "doctor");

        String name = p.getProperty("name");
        String age = p.getProperty("age");
        String job = p.getProperty("job");


        System.out.println(name);
        System.out.println(age);
        System.out.println(job);

        System.out.println("========");
    
        Enumeration e = p.propertyNames();

        while(e.hasMoreElements()) {
            String key = (String)e.nextElement();
            System.out.println(key + " = "  +p.getProperty(key));

        }   
     }
    
}
