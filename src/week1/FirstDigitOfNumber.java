package week1;

import java.util.Scanner;

public class FirstDigitOfNumber {

    //Ugly Solution
    public static int firstDigitApproach1(int n) {
        if (n == 0) return 0;
        if ((n / 10 == 0) && (n % 10 >= 0)) return (n % 10);
        return firstDigitApproach1(n / 10);
    }

    //Cleaner Solution
    public static int firstDigitApproach2(int n) {
        if (n < 10) return n;
        int num = n / 10;
        if (num < 10) {
            return num;
        }
        return firstDigitApproach2(n/10);
    }


    //Time Complexity - O(N)
    public static int firstDigitNumber(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    //Time Complexity - O(1)
    public static int firstDigitNumberUsingLog(int n) {
        int pow = (int)Math.log10(n);
        return (int)(n / Math.pow(10,pow));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalN = n;
        n = Math.abs(n);
        System.out.printf("The first digit of %d is %d", originalN, firstDigitNumber(n));
        System.out.println();
        System.out.printf("The first digit of %d is %d", originalN, firstDigitApproach1(n));
        System.out.println();
        System.out.printf("The first digit of %d is %d", originalN, firstDigitApproach2(n));
        System.out.println();
        System.out.printf("The first digit of %d is %d", originalN, firstDigitNumberUsingLog(n));
        sc.close();

    }
}
