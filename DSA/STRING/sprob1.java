package DSA.STRING;
import java.util.*;
public class sprob1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the array : "); //input from user for size
        int size = sc.nextInt();

        String array[] = new String[size];  // declaring

        int totalLength = 0; //initializing the total length as 0

        //input
        System.out.println("enter the strings : ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextLine();
            totalLength = array[i].length();

        }
        System.out.println("the total length of all strings combined is: " + totalLength);
        sc.close();




    }
}
