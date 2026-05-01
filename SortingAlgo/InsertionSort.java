package SortingAlgo;
public class InsertionSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] ={7,8,3,1,2};

        //time complexity: O(n^2)
        //insertion sort
        for(int i=1; i<arr.length;i++){ //taking i=0 as sorted
            int current = arr[i];
            int j = i-1;  //picking last index of sorted part
            while(j >= 0 && current < arr[j] ) {
                 //j is used to track the sorted part
                 arr[j+1] = arr[j]; //putting value of j in j+1
                 j--; //elements get pushed to the beginning

            } 

            //placement
            arr[j+1] = current;  //condition gets dissatisfied and then element is placed
        } 
        printArray(arr);
    }
}
