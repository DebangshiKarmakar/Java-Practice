package DSA.ARRAYS;
import java.util.*;
public class prob4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("enter the number of columns: ");
        int cols  = sc.nextInt();

        int[][] matrix = new int[rows][cols];  //declaring the matrix

        //input
        //rows
        System.out.println("enter the matrix: ");
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("the transpose of the matrix entered is : ");
        //output
        //transpose : rows-> columns , columns-> rows
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            sc.close();

        }


    }
}
