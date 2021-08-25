package IteratorExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
    public static void main (String[] args) {
        Set s = new HashSet();

        s.add("apple");
        s.add("strawberry");
        s.add("banana");
        s.add("peach");

        Iterator itr = s.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
            
        } 


    }
    
}
