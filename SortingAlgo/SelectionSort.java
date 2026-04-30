package SortingAlgo;
public class SelectionSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] ={ 7,8,3,1,2};
        
        //time complexity : O(n^2)
        //selction sort
        for(int i=0; i<arr.length; i++) {  //outer loop runs n times in every case
            int smallest = i; //stores index of the smallest element
            for(int j=i+1; j<arr.length; j++) {  //inner loop also n times
                //loop starts from next element after the smallest element
                //diff : SelectionSort increases the value in arr.length; Bubble sort decreases
                if(arr[smallest] > arr[j]) {
                    smallest = j;

                }
            }
            int temp = arr[smallest];
            arr[smallest] =  arr[i];
            arr[i] = temp;
            
        }
        printArray(arr);
    }
}
