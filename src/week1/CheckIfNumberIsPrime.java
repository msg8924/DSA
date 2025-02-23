package week1;

import java.util.Scanner;

public class CheckIfNumberIsPrime {

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        for (int i = 1; i * i <= n; i++ ) {
            if (n % i == 0) count++;
        }
        if ((count > 1) || (n == 1)){
            System.out.printf("%d is not a Prime",n);
        } else {
            System.out.printf("%d is a Prime", n);
        }
        System.out.println();
        if (!isPrime(n)) {
            System.out.printf("%d is not a Prime",n);
        } else {
            System.out.printf("%d is a Prime", n);
        }
    }
}
