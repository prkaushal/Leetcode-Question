// leetcode easy question
// question number 9 -->> Given an integer x, return true if x is a palindrome, and false otherwise.

public class palinderomeNumber {
    public static void main(String[] args) {
        
        System.out.println(isPalindrome(12321));
    }

    public static  boolean isPalindrome(int x) {
        int rev = 0;
        int original = x;
        while(x > 0){
            int a  = x % 10;
            rev = rev * 10 + a;
            x = x/10; 
        }
        if(original == rev){
            return true;
        } else {
            return false;
        }
    }
}
