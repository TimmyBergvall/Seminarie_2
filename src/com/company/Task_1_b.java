package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Task_1_b {
    // https://www.mysoftkey.com/data-structure-algorithm/how-to-check-balancing-of-symbol-using-stack-in-java/

    public static void main(String[] args) {
        //          //, ( ), [ ], { }

        System.out.println("Enter a message that is going to be checked:");
        Scanner MSC = new Scanner(System.in);
        String myString = MSC.nextLine();


        boolean balance = balancedSymbols(myString);

        if (balance) {
            System.out.println("The input is valid");
        } else {
            System.out.println("The input is not valid");

        }
    }


    public static boolean balancedSymbols(String myString) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < myString.length(); i++) {

            if (myString.charAt(i) == '[' || myString.charAt(i) == '{' || myString.charAt(i) == '(') {
                myStack.push(myString.charAt(i));

            } else if (i + 1 < myString.length()) {
                if (myString.charAt(i) == '/' && myString.charAt(i + 1) == '/') {
                    return true;

                }
            }

            if (myString.charAt(i) == ')') {
                if (!myStack.isEmpty() && myStack.peek() == '(') {
                    myStack.pop();
                } else {
                    return false;
                }
            } if (myString.charAt(i) == ']') {
                if (!myStack.isEmpty() && myStack.peek() == '[') {
                    myStack.pop();
                } else {
                    return false;
                }
            } else if (myString.charAt(i) == '}') {
                if (!myStack.isEmpty() && myStack.peek() == '{') {
                    myStack.pop();
                } else {
                    return false;
                }
            }

        }

        if (myStack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}