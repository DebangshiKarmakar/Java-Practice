package DSA.STRING;
import java.util.*;
public class sprob4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("the original string is : ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        
        //reversing the given string
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i; //5-1-0 =4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);  //passing backChar in front
            sb.setCharAt(back, frontChar);     //passing frontChar in back



        }
        System.out.println("the reversed string is : " + sb);
        sc.close();
        
        
    }
}
