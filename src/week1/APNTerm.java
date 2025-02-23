package week1;

import java.util.Scanner;

public class APNTerm {

    public static int compute(int a, int d, int n) {
        return a + ((n-1) * d);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int d = sc.nextInt();
       int n = sc.nextInt();
       int answer = compute(a,d,n);
       System.out.printf("a is %d, d is %d, n is %d and the answer is %d",a,d,n,answer);


    }

}
