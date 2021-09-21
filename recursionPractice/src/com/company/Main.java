package com.company;

public class Main {

    public static void main(String[] args) {

        countdown(10);
    }

    //this is a simple function displaying recursion in the most simple terms I could think up.
    //It just creates a little countdown by repeatedly calling itself with the function parameter
    //as the argument in the recursive case.  I make sure it doesn't go into an infinite loop by
    //providing a simple if statement to return control to main once the base case of 0 is met.
    public static void countdown(int i){
        System.out.println(i);
        if(i <= 0){
            return;
        }
        countdown(i - 1);
    }
}
