package week1;

import java.util.Scanner;

public class NNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value < 0) {
            System.out.println("Negative Number!!!!");
        } else {
            /*int sum = 0;
            while (value != 0) {
                sum += value % 10;
                value /= 10;
            }
            System.out.println("Sum of the N Natural Numbers is " + sum);*/
            System.out.println("Sum of N Natural Numbers is : " + ((value * (value + 1)) / 2));
        }
        sc.close();
    }
}
