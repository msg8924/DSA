package week1;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = r;
        int [][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((i == 0) || (i == (r-1))) {
                    arr[i][j] = 1;
                } else {
                    if ((j == 0) || (j == (c-1))) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }

            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
