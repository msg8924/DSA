package week1;

import java.util.Scanner;

public class GPNTerm {

    public static int compute(int a, int r, int n) {
        //ar^(n-1) => simple GP
        return (int) (a * Math.pow(r,n-1));
    }

    public static int computeSum(int a, int r, int n) {
        return (int) ((a * (1 - Math.pow(r,n))) / (1 - r));
    }

    public static int compute(int a, int r, int n, int counter) {
        if (counter == n) {
            return a;
        }
        return compute(a * r, r, n, counter+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int answer = compute(a, r, n);
        int recursive_answer = compute(a, r, n, 1);
        System.out.printf("a is %d, r is %d, n is %d and the answer is %d %n",a,r,n,answer);
        System.out.printf("a is %d, r is %d, n is %d and the answer is %d %n",a,r,n,recursive_answer);
        System.out.println(computeSum(a,r,n));
    }
}
