package week1;

import java.util.Scanner;

public class GetAllDivisorsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //O(n) - Time Complexity and O(1) - Space Complexity
        for(int i = 1 ; i <= n; i++) {
            if (n % i == 0) {
                if (i != 1) {
                    System.out.print("," + i);
                } else {
                    System.out.print(i);
                }

            }
        }

        System.out.println();
        //O(sqrt(n)) - Time Complexity and O(1) - Space Complexity
        int i;
        for (i = 1 ; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != 1) {
                    System.out.print(","+ i);
                } else {
                    System.out.print(i);
                }

            }
        }
        for (; i >= 1; i--) {
            if ((n % i == 0) && (n / i != i)){
                System.out.print("," + n/i);
            }
        }
        sc.close();

    }
}
