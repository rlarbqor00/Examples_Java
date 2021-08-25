package MapExam;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
    public static void main(String [] args) {
        Map map = new HashMap();

        map.put(1, "first");
        map.put("second", "second");
        map.put("third", "third");
        map.put("fourth", "fourth");
        map.put(4,  null);

        String str = (String)map.get("second");
        String str2 = (String)map.get(1);
        String str3 = (String)map.get(4);



        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
    
}
