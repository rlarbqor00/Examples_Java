package Boxing;

import java.util.ArrayList;

public class BoxingTest {
    public static void main(String[] args) {
        ArrayList <Object> list = new ArrayList<Object>();

        int data = 1234;

        list.add(data);
        
        int data2 = (Integer)list.get(0);
        System.out.println(data2);
        System.out.println(data);
    }
    
}
