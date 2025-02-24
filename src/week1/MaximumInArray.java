package week1;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;

        }

        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < n; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.printf("Max number in array %s is %d", Arrays.toString(arr), max);

        sc.close();

    }
}
