package week1;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int r = 2;

        for(int i = 1; i <= rows; i++) {
            int k = 1 + ((i-1) * r);
            //int k = 2 * (i-1);
            for (int z = 0; z < (rows-i); z++) {
                System.out.print(" ");
            }
            for(int j = 0; j < k; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        sc.close();

    }
}
