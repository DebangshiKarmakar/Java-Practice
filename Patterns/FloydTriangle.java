package Patterns;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter the starting number with which the triangle begins: ");
        int number = sc.nextInt(); //starting numver of the triangle

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number+ " ");
                number++; //number= number+1
            }
            System.out.println();
            sc.close();
        }
    }
}
