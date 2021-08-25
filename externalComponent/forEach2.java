package externalComponent;

import java.util.ArrayList;
import java.util.List;

import DataStructure.MyStudent;

public class forEach2 {
    public static void main(String [] args) {
        List <MyStudent> list = new ArrayList<MyStudent>();

        list.add(new MyStudent("Kim", 3));
        list.add(new MyStudent("park", 5));
        list.add(new MyStudent("Jeong", 1));
        list.add(new MyStudent("Oh", 6));
        list.add(new MyStudent("Lee", 2));

        System.out.println(list);
        System.out.println();

        for(MyStudent my : list) {
            System.out.println(my);
        }
    }
    
}
