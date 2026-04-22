package DSA.STRING;
import java.util.*;
public class pallindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = sc. nextLine(). toLowerCase(). replaceAll("\\s", "");
        boolean isPallindrome = true;

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() -1 -i)){
                isPallindrome = false;
                break;
            }

        }
        if(isPallindrome){
            System.out.println("string is pallindrome");
        }else{
            System.out.println("string is not pallindrome");
        }

        sc.close();

    }
}

