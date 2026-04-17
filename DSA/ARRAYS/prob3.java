package DSA.ARRAYS;

import java.util.*;
public class prob3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the size of the array: ");  //input for size
        int size = sc.nextInt();
        int numbers[] = new int[size];  //declaring the array

        //input loop

        System.out.println("enter the array: ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true; 
        for(int i=0; i<numbers.length-1; i++){  //numbers.length-1 is the terminating condition
    
            if(numbers[i] > numbers[i+1]){ // descending order condition 
                isAscending = false;
            }
            
        }

        if(isAscending){
            System.out.println("array is in ascending order");
        }
        else{
            System.out.println("array is in descending order");
        }

        sc.close();




    }
}
