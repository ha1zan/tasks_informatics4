import java.util.Scanner;

public class task15o{
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        return n == reverseNumber(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
