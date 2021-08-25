package Generic;



public class GenericTest {
    public static void main(String[] args) {
        GOrigin<String> t = new GOrigin<String>();

        String str = "HELLO";

        t.set(str);

        t.getData();

        GOrigin<Integer> t2 = new GOrigin<Integer>();

        int x = 4;
        t2.set(x);
        t2.getData();
        
        GOrigin t3 = new GOrigin<Object>();

        t3.set(str);
        t3.getData();
        
        t3.set(x);
        t3.getData();
        
    }
    
}
