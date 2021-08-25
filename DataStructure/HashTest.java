package DataStructure;

import java.util.HashSet;
import java.util.Set;

public class HashTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Hello");
        set.add(178);
        set.add("Hello");
        set.add("Hi");
        set.add("Bye");
        set.add(new MyStudent());

        Object[] obj = set.toArray();

        for(int i=0; i<set.size(); i++) {
            System.out.println(set);

        }
        


        
    } 
    
}
