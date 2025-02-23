package week1;

import java.util.Scanner;

import static java.lang.Math.abs;

public class FindLastDigit {

    public static int compute(int n) {
        return abs(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = compute(n);
        System.out.println(digit);
    }
}
