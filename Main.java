package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int checker = 1;
	    Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        System.out.println("Fill list with ints. Empty string ends:");
        while(checker == 1){
            String input = scanner.nextLine();
            if(input.equals("")){
                checker = 0;
                break;
            }
            int userNum = Integer.valueOf(input);
            myList.add(userNum);
        }
        System.out.println("Let's search for a number! What number should we search for?");
        String itemString = scanner.nextLine();
        int item = Integer.valueOf(itemString);
        System.out.println("Number of guesses: " + binarySearch(myList, item));
    }
    public static int binarySearch(ArrayList<Integer> list, int item){
        int low = 0;
        int high = list.size() - 1;
        int guess = 0;
        while(low <= high) {
            int mid = (low + high) / 2;
            guess = list.get(mid);
            if (guess == item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return guess;
    }
}
