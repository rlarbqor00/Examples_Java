package MapExam;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExam {
    public static void main(String[] args) {
        Map map = new Hashtable();

        map.put(1, 100);
        map.put("second", "Hi");
        map.put(3, "Bye");
        map.put(10, "haha");
       // map.put(15, null);  hashtable은 null값 사용 불가

        String str = (String)map.get(10);
        String str2 = (String)map.get(15);
        
        System.out.println(str);
        System.out.println(str2);

    }
    
}
