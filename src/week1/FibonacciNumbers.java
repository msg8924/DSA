package week1;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciNumbers {

    static HashMap<Integer, Integer> map = new HashMap<>();

    private static void computeFibonacciSeries(int n) {
        if (n == 1) {
            System.out.println("1");
        } else if (n == 2) {
            System.out.println("1,1");
        } else {
            System.out.print("1,1");
            int a = 1;
            int b = 1;
            for(int i = 2; i < n; i++) {
                System.out.print("," + (a+b));
                int temp = b;
                b = a + b;
                a = temp;
            }
        }
    }

    private static int computeNthFibonacciNumber(int n) {
        if (n <= 2) return 1;
        int a = 1;
        int b = 1;
        int c = a + b;
        int counter = 2;
        while(counter < n) {
            counter++;
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


    //Really Bad Approach - Bad Coding (uses unnecessary variables and approach)
    private static int computeRecursiveFibonacciApproach1(int n) {
        if (n <= 2) return 1;
        return computeRecursiveFibonacciNumber(0,1,n,1);
    }

    private static int computeRecursiveFibonacciNumber(int a, int b, int n, int counter) {
        if (counter == (n - 1)) return a + b;
        return computeRecursiveFibonacciNumber(b, a + b, n, counter+1);
    }

    //Slight Better O(2^N) - Time Complexity and cleaner code
    private static int computeRecursiveFibonacciApproach2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return computeRecursiveFibonacciApproach2(n-1) + computeRecursiveFibonacciApproach2(n - 2);
    }

    //Better Approach with Memoization.
    // Time Complexity - O(n) and Space Complexity - O(n)
    // Improves time complexity from O(2^n) to O(n)
    private static int computeRecursiveFibonacciApproach3(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (map.containsKey(n)) {
            return map.get(n);
        }
        map.put(n,computeRecursiveFibonacciApproach3(n-1) + computeRecursiveFibonacciApproach3(n-2));
        return map.get(n);
    }

    public static void main(String[] args) {
        //Fibonacci Series : 1 1 2 3 5 8 13....
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(computeNthFibonacciNumber(n));
        computeFibonacciSeries(n);
        System.out.println();
        System.out.println(computeRecursiveFibonacciApproach1(n));
        System.out.println(computeRecursiveFibonacciApproach2(n));
        System.out.println(computeRecursiveFibonacciApproach3(n));
        sc.close();


    }
}
