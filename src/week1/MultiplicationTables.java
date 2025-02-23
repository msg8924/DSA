package week1;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxNum = sc.nextInt();
        for (int i = 1; i <= maxNum; i++) {
            System.out.print(num * i + " ");
        }
        sc.close();

    }
}
