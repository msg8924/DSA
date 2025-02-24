package week1;

import java.util.Scanner;

public class FirstDigitOfDecimal {

    public static double shiftNumber(double n) {
        if (n >= 1) return n;
        return shiftNumber(n * 10);
    }

    public static int firstDigitRecursion(int n) {
        if (n < 10) return n;
        int num = n / 10;
        if (num < 10) return num;
        return firstDigitRecursion(num / 10);
    }

    public static int firstDigit(double n) {
        int pow = (int)Math.log10(n);
        return (int) (n / Math.pow(10,pow));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double originalN = n;
        int digit;
        n = Math.abs(n);
        if (n < 1) {
            n = shiftNumber(n);
        }

        System.out.printf("The first digit of %g is %d", originalN, firstDigitRecursion((int)n));
        System.out.println();
        System.out.printf("The first digit of %g is %d", originalN, firstDigit(n));


    }
}
