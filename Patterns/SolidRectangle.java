package Patterns;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args){
        //solid rectangle
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of row: ");
        int n= sc.nextInt();

        System.out.println("enter number of columns: ");
        int m= sc.nextInt();

        
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }

    }
}

