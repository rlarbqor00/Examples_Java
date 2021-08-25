package DataStructure;

import java.util.LinkedList;

public class VarTest {
    public static void main(String [] args) {
        LinkedList fruitList = new LinkedList();

        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Strawerry");
        fruitList.add(2,"Melon");

        int position = fruitList.indexOf("Banana");

        fruitList.remove(3);


        System.out.println(position);
        
        for(int i=0; i<fruitList.size(); i++){
            System.out.println(i +" " +fruitList.get(i));


        }
        
        System.out.println();
        
        fruitList.add(2,"Mango");
        for(int i=0; i<fruitList.size(); i++){
            System.out.println(i +" " +fruitList.get(i));


        }




    }
    
}
