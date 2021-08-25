package DataStructure.LinkedListExam;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();

        // numbers.addFirst(20);
        // numbers.addFirst(10);
        // numbers.addFirst(30);

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.addLast(50);
        numbers.addLast(60);
        numbers.addLast(70);
        System.out.println(numbers);

        // numbers.add(2, 25);
        // numbers.add(1, 15);

        // System.out.println(numbers.removeFirst());
        // System.out.println(numbers.remove(2));
        // System.out.println(numbers.removeLast());
        // System.out.println(numbers.size());
        // System.out.println(numbers.get(4));
        // System.out.println(numbers.get(1));
        // System.out.println(numbers.indexOf(20));
        LinkedList.ListIterator i = numbers.listIterator();

        // while(i.hasNext()) {
        // System.out.println(i.next());
        // System.out.println(i.hasNext());

        // }
        // i.add(5);
        // i.next();
        // i.add(13);
        while (i.hasNext()) {
            if ((int) i.next() == 20) {
                i.remove();
            }
        }

        System.out.println(numbers);
    }

}
