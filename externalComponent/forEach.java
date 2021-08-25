package externalComponent;

public class forEach {
    public static void main(String[] args) {
        String[] str = {"apple", "kiwi", "melon", "strawberry"};
        
        for(int i=0; i<str.length; i++) {
            System.out.println(str[i]);

        }

        System.out.println();

        for(String temp : str) {
            System.out.println(temp);
        }
    }
    
}
