package DSA.STRING;
import java.util.*;
public class sprob3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your email: ");  //taking user input
        String email = sc.next();

        String username = "";  //declaring an empty string

        System.out.println("the username is : ");

        for(int i=0; i<email.length(); i++){ // when @ gets passed we come out of the loop
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                username += email.charAt(i); //the input without the @ part gets updated in the username 
            }
        }
        System.out.println(username);
        sc.close();
    }
}
