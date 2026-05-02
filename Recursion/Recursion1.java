package Recursion;

public class Recursion1 {
    //print numbers 5 to 1
    public static void printNumb(int n) {
        if (n == 0) {   //base case
            return;
        }
        System.out.println(n);
        printNumb(n-1);  //decrement by 1
        //sequence 5 -> 4 -> 3 -> 2 -> 1
    }
    public static void main(String args[]) {
        int n = 5;
        printNumb(n);
    }
}
