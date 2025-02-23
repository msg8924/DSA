package week1;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rows = 0;
        int columns = 0;

        while (rows < n) {
            rows++;
            while (columns < n) {
                columns++;
                System.out.print("x");
            }
            System.out.println();
            columns = 0;
        }
        System.out.println();
        columns = 0;
        rows = 0;
        int number  = 1;
        while (rows < n) {
            rows++;
            while (columns < n) {
                columns++;
                System.out.print(number);
            }
            System.out.println();
            columns = 0;
            number++;
        }


        sc.close();

    }
}
