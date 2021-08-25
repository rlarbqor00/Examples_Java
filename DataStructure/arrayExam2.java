package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayExam2 {
    public static void main(String[] args) {
        ArrayList <Integer>numbers = new ArrayList <>();

        numbers.add(0, 50);
        numbers.add(1, 20);
        numbers.add(2, 40);
        numbers.add(3, 5);
        numbers.add(4, 522);
        numbers.add(5, 35);

        Iterator itr = numbers.iterator();

        

        while(itr.hasNext()) {
            int value = (Integer)itr.next();

            System.out.println(value);
            if(value == 5) {
                System.out.println("Intect number 5");
                break;
                }
            }
            System.out.println();

            for(int value : numbers) {
                System.out.println(value);

            }

        }

    }
    

