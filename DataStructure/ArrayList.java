package DataStructure;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List list = (List) new ArrayList();

        list.add("Hello");
        list.add(123);
        list.add(new MyStudent());
        list.add("Hello");
        list.add(123);

        String str = (String)list.get(0);

        System.out.println(str);

    }
    
}
