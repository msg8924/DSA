package week1;

import java.util.Arrays;
import java.util.Scanner;

public class FindAverageArray {

    public static void main(String [] args) {
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

        System.out.printf("Average of this array %s is %f", Arrays.toString(arr), (total / (n * 1.0)) );

        sc.close();
    }
}
