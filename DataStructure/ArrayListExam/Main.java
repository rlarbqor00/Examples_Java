package DataStructure.ArrayListExam;



public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.addLast(50);
        numbers.addLast(60);
        
        System.out.println(numbers);


        // numbers.remove(1);
        // numbers.removeFirst();

        System.out.println(numbers.remove(1));
        // System.out.println(numbers);
        // System.out.println(numbers.removeFirst());
        // System.out.println(numbers);

        // numbers.removeLast();
        // System.out.println(numbers);

        // System.out.println(numbers.get(1));
        // System.out.println(numbers.size());
        // System.out.println(numbers.indexOf(30));

        ArrayList.ListIterator li = numbers.listIterator();


        // while(li.hasnext()) {
        //     System.out.println(li.next());
        // }
        System.out.println();
        // System.out.println(li.next());
        // System.out.println(li.next());
        // System.out.println(li.next());
        // System.out.println(li.next());
        // System.out.println(li.next());
        // System.out.println(li.next());
        // System.out.println(li.previous());
        // System.out.println(li.previous());
        // System.out.println(li.previous());

        // while(li.hasPrevious()) {
        //     System.out.println(li.previous());

        // }

        // while(li.hasnext()) {
        //     int number = (int)li.next();
        //     if(number == 30) {
        //         li.add(35);

        //     }
            
        // }
        while(li.hasnext()) {
            int number = (int)li.next();
            if(number == 30) {
                li.remove();

            }
            
        }
        System.out.println(numbers);


        


        

    }
    
}
