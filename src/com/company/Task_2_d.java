package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Task_2_d {

    static class stack {
        // https://www.geeksforgeeks.org/implement-a-stack-using-single-queue/
        Queue<Integer> q = new LinkedList<Integer>();

        void push(int val) {
            if (q.size() >= 3) {
                System.out.println("OVERFLOW");
                System.exit(0);
            }
            // get previous size of queue
            int size = q.size();

            // Add current element
            q.add(val);

            // Pop (or Dequeue) all previous
            // elements and put them after current
            // element
            for (int i = 0; i < size; i++) {
                // this will add front element into
                // rear of queue
                int x = q.remove();
                q.add(x);
            }
        }

        // Removes the top element
        int pop() {
            if (q.size() == 0) {
                System.out.println("UNDERFLOW");
                System.exit(0);
            }
            if (q.isEmpty()) {
                System.out.println("No elements");
                return -1;
            }
            int x = q.remove();
            return x;
        }

        // Returns top of stack
        int top() {
            if (q.isEmpty())
                return -1;
            return q.peek();
        }

        // Returns true if Stack is empty else false
        boolean isEmpty() {
            return q.isEmpty();
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        // remove // to get overflow
        //s.push(4);


        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        // remove // to get overflow
        //System.out.println(s.pop());


    }
}