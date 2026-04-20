package DSA.STRING;
import java.util.*;
public class sprob2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string: ");  //input string
        String str = sc.next();

        String result = "";  //declaring an empty string
        
        //replacing e with i
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)== 'e'){  //checking whether the character that is passed == e
                result += 'i';

            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
