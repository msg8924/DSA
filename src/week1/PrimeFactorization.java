package week1;

import java.util.Scanner;

public class PrimeFactorization {

    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static void factorizeApproach1(int num) {
        for(int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                int x = i;
                while (num % x == 0) {
                    System.out.print(i + ",");
                    x = x * i;
                }
            }
        }
    }


    private static void factorizeApproach2(int num) {
        //O(logN)
        while (num % 2== 0) {
            System.out.print(2 + ",");
            num /= 2;
        }
        //O(sqrt(n))
        for (int i = 3; i <= Math.sqrt(num); i=i+2) {
            while (num % i == 0) {
                System.out.print(i+",");
                num /= i;
            }
        }
        //O(1)
        if (num > 1)
            System.out.println(num);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // get a list of prime numbers
        // divide the number by prime number
        // with the quotient attempt to divide again with the prime number
        // till the quotient is a prime number
        System.out.printf("Prime factorization of %d is ", n);
        factorizeApproach1(n);
        System.out.println();
        System.out.printf("Prime factorization of %d is ", n);
        factorizeApproach2(n);
        sc.close();


    }
}
