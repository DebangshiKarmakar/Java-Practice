package SortingAlgo;

public class BubbleSort {
    public static void printArray(int arr[]) {
        //function to print the sorted array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {7,8,3,1,2};

        //time complexity = O(n^2)
        //bubble Sorting
        for(int i=0; i<arr.length-1; i++) {  //outer loop runs n-1 times
            for(int j=0; j<arr.length-i-1; j++) {  
                // -i because 1st time array unsorted. 2nd iteration 1 element is sorted
                //element to be placed in the end while sorting = i hence -i
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j]; //temp stores the value at arr at i index
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        printArray(arr);
    }
}
