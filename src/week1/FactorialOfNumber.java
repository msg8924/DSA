package week1;

import java.util.Scanner;

public class FactorialOfNumber {

    private static int computeRecursive(int n) {
        if (n == 1) return n;
        return n * computeRecursive(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 1;
        for(int i = 1; i <= n; i++) {
            total *= i;
        }
        int totalRecursive = computeRecursive(n);
        System.out.printf("Iterative Factorial of %d! is %d",n,total);
        System.out.println();
        System.out.printf("Recursive Factorial of %d! is %d",n,totalRecursive);
        sc.close();

    }
}
