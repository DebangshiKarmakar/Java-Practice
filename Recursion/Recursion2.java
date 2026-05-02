package Recursion;
public class Recursion2 {
    //printing sum in decreasing order
    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        printSum(n-1, sum);
    }
    public static void main(String args[]){
        printSum(5, 0);
    }
}
