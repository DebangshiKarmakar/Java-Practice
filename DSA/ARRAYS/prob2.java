package DSA.ARRAYS;

import java.util.*;

public class prob2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array: ");  //input size of array
        int size = sc.nextInt();

        int numbers[] = new int[size]; //declares a variable number in which the size is stored

        //inputs
        System.out.println("enter the array : ");

        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();

        }

        int max = Integer.MIN_VALUE; //starts at smallest value so any number would be large
        int min= Integer.MAX_VALUE; //starts at largest value so any number would be large

        //output

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] <= min){
                min = numbers[i];
            }
            if(numbers[i] >= max){
                max = numbers[i];
            }
            
        }
        System.out.println("largest number is : " + max);
        System.out.println("smallest number: " + min);
        sc.close();



    }
}
