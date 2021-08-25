package Examples.DataStructure.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers =  new ArrayList();
        
        ArrayList.ListIterator li = numbers.listIterator();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.addLast(50);
        numbers.addLast(60);

        System.out.println(numbers);
        
        //numbers.add(1, 15);
        
        //numbers.addFirst(1);

        //numbers.remove(0);

        //System.out.println(numbers.remove(1));
        //System.out.println(numbers.removeFirst());

        //System.out.println(numbers.removeLast());

        //System.out.println(numbers.get(2));

        //System.out.println(numbers.indexOf(40));

    

        while(li.hasnext()) {
            System.out.println(li.next());


        }
        System.out.println();
        
        while(li.hasprevious()) {
            System.out.println(li.previous());

        }



    }
    
    
}
