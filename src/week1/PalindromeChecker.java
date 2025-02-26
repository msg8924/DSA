package week1;

import java.util.Scanner;

public class PalindromeChecker {

    private static void isPalindrome(int num) {
        boolean isPalindrome = true;
        int originalNum = num;
        num = Math.abs(num);

        int pow = (int)Math.log10(num);
        int maxDigits = pow + 1;
        int lastDigit = 0;
        int firstDigit = 0;
        while (num > 0) {
            lastDigit = num % 10;
            if (pow != 1) {
                firstDigit = (num / (int) Math.pow(10, pow));
            } else {
                firstDigit = num % 10;
            }
            if (firstDigit != lastDigit) {
                isPalindrome = false;
                break;
            }
            num = num - (firstDigit * (int)Math.pow(10,pow));
            pow -= 1;
            num /= 10;
        }
        //if (maxDigits == 1) isPalindrome = false;
        System.out.printf("%d is a palindrome: %b", originalNum, isPalindrome);
    }

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
        //if (string.length() == 1) isPalindrome = false;
        System.out.printf("%s is a palindrome: %b", string, isPalindrome);
    }

    private static void isPalindromEfficient(String string) {
        boolean isPalindrome = true;
        int start = 0;
        int end = string.length() - 1;
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                isPalindrome = false;
                break;
            }
            end--;
            start++;
        }
        //if (string.length() == 1) isPalindrome = false;
        System.out.printf("%s is a palindrome: %b", string, isPalindrome);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String string = sc.nextLine();
        isPalindrome(string);
        System.out.println();
        isPalindromEfficient(string);
        System.out.println();*/
        int num = sc.nextInt();
        isPalindrome(num);
        sc.close();
    }

}
