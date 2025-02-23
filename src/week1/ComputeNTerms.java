package week1;

import java.util.Scanner;

public class ComputeNTerms {

    private static int compute(int a, int r, int n) {
        return APNTerm.compute(a, r, n);
    }

    public static int computeSum(int a, int r, int n) {
        /*int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += compute(a, r, i);
        }
        return answer;*/

        return (n * (n+1)) / 2;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int sum = computeSum(a,r, n);
        System.out.println(sum);

    }
}
