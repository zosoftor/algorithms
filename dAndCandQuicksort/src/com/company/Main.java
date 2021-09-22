package com.company;

import java.util.ArrayList;
//So a bit convoluted but I wanted to accomplish quicksort with ArrayLists.  In the actual quicksort function I wrote it
//did feel a bit inelegant and as if I had to go around the world several times to get data successfully through the
//function.  That's ok.  I am sure there is a better way to implement quicksort with ArrayLists in Java and I will dis-
//cover it as I refine my understanding of the internals of the algorithm.
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(113);
        arrList.add(21);
        arrList.add(3);
        arrList.add(456);
        arrList.add(59);
        arrList.add(651);
        arrList.add(8);
        arrList.add(31);
        arrList.add(76);
        arrList.add(999);
        arrList.add(5431);
        arrList.add(-194);
        arrList.add(0);
        arrList.add(-764);
        arrList.add(29);
        //I cannot believe this worked!! Haha!  Had to make it an ArrayList of ArrayLists of ArrayLists and on and on but hey...it works!
        //we just ignore all the brackets as is common practice in modern programming, right?
        System.out.println(quicksort(arrList));
    }

    public static ArrayList<ArrayList> quicksort(ArrayList<Integer> arrList){
        //if the list is 0 or 1 element then it is sorted...I just put it in another ArrayList and send it packing
        if(arrList.size() < 2){
            ArrayList<ArrayList> newArrList = new ArrayList<>();
            newArrList.add(arrList);
            return newArrList;
        }
        //You could use any pivot point you like really with this algorithm working essentially via D&C.  I just chose
        //the first element for brevity then wrapped in its own ArrayList to make sure I could package it with the other
        //sub-lists later.
        int pivot = arrList.get(0);
        ArrayList<Integer> pivotList = new ArrayList<>();
        pivotList.add(arrList.get(0));
        //creating sub-lists below for values lesser than/greater than chosen pivot point
        ArrayList<Integer> lessThanPivot = new ArrayList<>();
        ArrayList<Integer> greaterThanPivot = new ArrayList<>();
        //going through the passed in list and parsing values into their correct list based on chosen pivot
        for(int element: arrList){
            if(element > pivot){
                greaterThanPivot.add(element);
            }
            if(element < pivot){
                lessThanPivot.add(element);
            }
        }
        //here I use recursion to sort each sub-list and stick them in their own sorted sub-lists
        ArrayList<ArrayList> sortedLessThanPivot = quicksort(lessThanPivot);
        ArrayList<ArrayList> sortedGreaterThanPivot = quicksort(greaterThanPivot);
        ArrayList<ArrayList> sortedArrayList = new ArrayList<>(); //a list to house the final sorted list

        //below I add the sorted less than list then the pivot list then the greater than sub-list to the ArrayList
        //which I will return to Main
        sortedArrayList.add(sortedLessThanPivot);
        sortedArrayList.add(pivotList);
        sortedArrayList.add(sortedGreaterThanPivot);
        return sortedArrayList; //return sorted list to Main and stick a fork in it!
    }
}
