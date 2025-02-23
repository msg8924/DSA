package week1;

import java.util.HashMap;
import java.util.Scanner;

public class FactorialOfNumber {

    static HashMap<Integer, Integer> map = new HashMap<>();

    private static int computeRecursive(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * computeRecursive(n - 1);
    }

    private static int computeRecursiveMemoization(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (map.containsKey(n)) return map.get(n);
        map.put(n, n * computeRecursive(n-1));
        return map.get(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 1;
        for(int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.printf("Iterative Factorial of %d! is %d",n,total);
        System.out.println();
        System.out.printf("Recursive Factorial of %d! is %d with memoization",n,computeRecursiveMemoization(n));
        System.out.println();
        System.out.printf("Recursive Factorial of %d! is %d without memoization",n,computeRecursive(n));
        sc.close();

    }
}
