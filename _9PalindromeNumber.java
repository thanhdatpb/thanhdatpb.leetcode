import java.util.Scanner;

public class _9PalindromeNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    x = scanner.nextInt();
    isPalindrome(25);
  }
  public boolean isPalindrome(int x) {
    if (x < 0){
      return false;
    }
    else{
         // khoi tao y la so sau khi dao x
     int y = 0, original;
     original = x;
     //dung vong lap dao x
     for (; x != 0; x /= 10) {
       int digit = x % 10;
       y  = y * 10 + digit;
     }

     if (y == original){
       return true;
     }
     else{
       return false;
     }
    }
 }
}