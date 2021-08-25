package ListExam;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet tset = new TreeSet();

        tset.add("hong");
        tset.add("kim");
        tset.add("park");
        tset.add("noh");
        tset.add("lee");
        tset.add("jeon");

        System.out.println(tset);
        
        Iterator itr = tset.iterator();

        System.out.println("오름차순으로 출력");

        while(itr.hasNext()) {
            System.out.println(itr.next());

        }

        System.out.println();

        Iterator itr2 = tset.descendingIterator();

        System.out.println("내림차순으로 출력");

        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
    
    

