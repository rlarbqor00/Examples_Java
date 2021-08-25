package StackExam;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");

        while(! s.isEmpty()) {
            System.out.println(s.pop());
        }
        
    }
    
}
