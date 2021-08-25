package ListExam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetTest2 {
    public static void main(String [] args) {
        TreeMap tm = new TreeMap();

        tm.put("Hong", "Daegu");
        tm.put("Kim", "Busan");
        tm.put("Park", "Seoul");
        tm.put("Jeon", "Daejeon");
        tm.put("Lee", "Incheon");
        tm.put("Hong", "Daegu");

        Set set = tm.keySet();
        
        Iterator itr = set.iterator();
        
        System.out.println(tm);

        
        while(itr.hasNext()){
            String key = (String)itr.next();
            String value = (String)tm.get(key);

            System.out.println(key + " = " + value);
            

        }
    }
}
    

