package week1;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }

        System.out.printf("For this array %s, the total is %d", Arrays.toString(arr), total);

        sc.close();
    }
}
