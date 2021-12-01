package com.company;

import java.util.Stack;

public class Task_2_a {
    // https://www.geeksforgeeks.org/queue-using-stacks/
    static Stack<Integer> myStack = new Stack<>();
    static Stack<Integer> myQueue = new Stack<>();

    public static void main(String[] args) {
        addToQueue(1);
        addToQueue(2);
        addToQueue(3);
        addToQueue(4);
        // remove // to get overflow
        //addToQueue(5);


        System.out.println(removeFromQueue());
        System.out.println(removeFromQueue());
        System.out.println(removeFromQueue());
        System.out.println(removeFromQueue());
        // remove // to get underflow
        //System.out.println(removeFromQueue());


    }

    public static void addToQueue(int num) {
        if (myStack.size() >= 4) {
            System.out.println("OVERFLOW");
            System.exit(0);
        }

        while (!myStack.isEmpty()) {
            myQueue.push(myStack.pop());

        }

        myStack.push(num);

        while (!myQueue.isEmpty()) {
            myStack.push(myQueue.pop());

        }
    }


    public static int removeFromQueue() {
        if (myStack.size() == 0) {
            System.out.println("UNDERFLOW");
            System.exit(0);
        }
        if (myStack.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        int num = myStack.peek();
        myStack.pop();
        return num;

    }
}

