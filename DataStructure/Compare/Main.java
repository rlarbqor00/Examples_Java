package DataStructure.Compare;

import DataStructure.ArrayListExam.ArrayList;
import DataStructure.LinkedListExam.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.addLast(10);
        a.addLast(20);
        a.addLast(30);
        a.get(2);
        ArrayList.ListIterator ai = a.listIterator();

        while (ai.hasnext()) {
            if ((int) ai.next() == 20) {
                ai.add(25);

            }

        }

        LinkedList l = new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.get(2);
        LinkedList.ListIterator li = l.listIterator();

        while (li.hasNext()) {
            if ((int) li.next() == 20) {
                li.add(25);
            }
        }

    }
}