package week1;

import java.util.Scanner;

public class FirstDigitOfDecimal {

    public static double shiftNumber(double n) {
        if (n >= 1) return n;
        return shiftNumber(n * 10);
    }

    public static int firstDigit(int n) {
        if (n < 10) return n;
        int num = n / 10;
        if (num < 10) return num;
        return firstDigit(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double originalN = n;
        int digit;
        n = Math.abs(n);
        if (n > 1) {
            digit  = firstDigit((int)n);
        } else {
            double shiftedNumber = shiftNumber(n);
            digit = (firstDigit((int)shiftedNumber));
        }

        System.out.printf("The first digit of %g is %d", originalN, digit);


    }
}
