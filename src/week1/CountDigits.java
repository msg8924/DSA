package week1;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.printf("Number of digit in %d is %d", original, count);

        sc.close();


    }
}
