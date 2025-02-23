package week1;

import java.util.Arrays;
import java.util.Scanner;

public class LowestCommonMultiple {

    private static int computeLCM(int a, int b) {
        return Math.abs(a * b) / computeGCD(a,b);
    }

    private static int computeGCD(int a, int b) {
        int gcd = 1;
        a = Math.abs(a);
        b = Math.abs(b);
        int min = Math.min(a,b);
        for (int i = 1; i <= min; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }

    //Bad Solution for more than 2 numbers. Also, pretty bad if the numbers are large
    private static int computeLCMAlternate(int a, int b) {
        int lowerBound = Math.max(a,b);
        int upperBound = a * b;
        int lcm = 1;
        for (int i = lowerBound; i <= upperBound; i++) {
            if ((i % a == 0) && (i % b == 0)) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of elements to compute LCM for:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (n < 1) return;

        int lcm = computeLCM(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            lcm = computeLCM(lcm,nums[i]);
        }

        if (lcm > 1) {
            System.out.printf("LCM of %s is %d ", Arrays.toString(nums), lcm);
        } else {
            System.out.printf("No LCM found for %s%n", Arrays.toString(nums));
        }
        System.out.println();
        System.out.println("Compute new LCM for 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcmNew = computeLCMAlternate(a,b);
        System.out.printf("LCM of %d and %d is %d", a, b, lcmNew);
        sc.close();

    }
}
