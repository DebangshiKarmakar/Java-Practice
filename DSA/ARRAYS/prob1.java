package DSA.ARRAYS;

import java.util.Scanner;

public class prob1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the string: ");  //inputs the size of the array
        int size = sc.nextInt();
        String names[] = new String[size];  //declaration of variable

        //input
        System.out.println("enter the string: ");  // using this we enter the input dats
        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }

        //output
        for(int i=0; i<names.length; i++){
            System.out.println("name " + (i+1) + " is: "+ names[i] ); //desired format of the output
        }
        sc.close();
        }

    }

