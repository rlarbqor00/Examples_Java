package IteratorExam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("hello");
        list.add("hi");
        list.add("bye");
        list.add("strawberry");
        list.add("apple");

        // for(int i=0; i<list.size(); i++) {
        //     System.out.println(list.get(i));

        // }

        Iterator itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
    
}
