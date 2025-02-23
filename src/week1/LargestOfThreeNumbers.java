package week1;

import java.util.Scanner;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = sc.nextInt();
        int a = largest;
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b >= largest)  largest = b;
        if (c >= largest)  largest = c;
        System.out.printf("Largest Number of {%d,%d,%d} is %d", a, b, c, largest);
        sc.close();
    }
}
