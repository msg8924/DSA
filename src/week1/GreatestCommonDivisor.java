package week1;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd1 = 1;
        int gcd2 = 1;

        for (int i = 1; i <= num1; i++) {
            if ((num1 % i == 0) && (i <= num2)) {
                gcd1 = i;
            }
        }
        for (int j = 1; j <= num2; j++) {
            if ((num2 % j == 0) && (j <= num1)) {
                gcd2 = j;
            }
        }
        if (gcd1 == gcd2) {
            System.out.printf("The GCD for %d and %d is %d", num1, num2, gcd1);
        } else {
            System.out.printf("NO GCD was found %d and %d", num1, num2);
        }

        int gcd = 1;
        int min = Math.min(num1,num2);
        for (int k = 1; k <= min; k++) {
            if ((num1 % k == 0) && (num2 % k == 0)) {
                gcd = k;
            }
        }
        System.out.println();

        if (gcd > 1) {
            System.out.printf("The GCD for %d and %d is %d", num1, num2, gcd);
        } else {
            System.out.printf("NO GCD was found %d and %d", num1, num2);
        }


        sc.close();

    }
}
