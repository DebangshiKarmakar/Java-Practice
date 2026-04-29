package BitManipulation;
public class SetBit {
    public static void main(String args[]) {
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;
     

        // 5 is changed to 7 using bit manipulation
        int newNumber = bitMask | n; //or function is performed
        System.out.println(newNumber);
    }
}
