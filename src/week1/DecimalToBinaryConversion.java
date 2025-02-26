package week1;

import java.util.Scanner;

public class DecimalToBinaryConversion {

    public static String convert(int num) {
        int pow = (num / 2) - 1;
        int binary = 0;
        int count = 32 - pow;
        int originalNum = num;
        while (num != 0) {
            int quotient = num / 2;
            int remainder = num % 2;
            binary += (int)(remainder * Math.pow(10,pow));
            num = quotient;
            pow = pow - 1;
        }
        String result = "0".repeat(count)+binary;
        System.out.printf("%d represented as a binary string %s",originalNum, result);
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        convert(num);
    }
}
