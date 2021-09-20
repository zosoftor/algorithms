package com.company;

public class Main {

    void sort(int arr[]){
        int n = arr.length;
        //iterate through array
        for(int i = 0; i < n - 1; i++){
            //find minimum element in unsorted array
            int min_idx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            }
            //swap the minimum with first/prev element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]){
        //just a method to print the array once it has been sorted
        int n = arr.length;
        for(int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
	    //code testing sorting method
        Main ob = new Main();
        int arr[] = {64, 26, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
