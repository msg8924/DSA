package week1;

import java.util.Scanner;

public class PalindromeChecker {
    private static void isPalindrome(String string) {
        boolean isPalindrome = true;
        int midIndex = (string.length() - 1) / 2;
        int maxIndex = (string.length() - 1);
        int frontIndex = 0;
        int backIndex = maxIndex;
        while ((frontIndex <= midIndex) && (midIndex != maxIndex)) {
            if (string.charAt(frontIndex) != string.charAt(backIndex)) {
                isPalindrome = false;
                break;
            }
            frontIndex++;
            backIndex--;
        }
        if (string.length() == 1) isPalindrome = false;
        System.out.printf("%s is a palindrome: %b", string, isPalindrome);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        isPalindrome(string);


        sc.close();
    }

}
