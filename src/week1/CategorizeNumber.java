package week1;

import java.util.Scanner;

public class CategorizeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        if (number > 0) {
            System.out.print("Positive ");
        } else {
            System.out.print("Negative ");
        }
        if (number % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
        sc.close();

    }
}
