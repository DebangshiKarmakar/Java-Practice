package DSA.ARRAYS;
import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array: ");
        int size = sc.nextInt(); //takes input of the size of the array

        int num[] = new int[size];   //declares variable to store size
        int total = 0; //initializes the total = 0

        System.out.println("enter the array: ");
        for(int i=0; i<size; i++){
            System.out.print("element " + i + ": ");  //takes input at each position of the array
            num[i] = sc.nextInt();
            total +=num[i]; //adds the input value to find sum

        }

        double average = (double) total /num.length; // can also use size instead of num.length
        System.out.println("sum is : "+ total);
        System.out.println("average is : " + average);
        sc.close();
    }
}
