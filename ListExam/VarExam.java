package ListExam;

import java.util.LinkedList;

public class VarExam {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add("apple");
        list.add("banana");
        list.add("watermelon");
        list.add("mango");

        for(int i=0; i<list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }
        System.out.println();
        
        System.out.println("Remove mango");
        
        list.remove("mango");
        
        for(int i=0; i<list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }
        
        System.out.println("\nAdd strawberry to 2");
        
        list.add(2, "strawberry");
        
        for(int i=0; i<list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }

    }
    
}
