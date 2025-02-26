package week1;

import java.util.Scanner;

public class DecimalToBinaryConversion {

    private static void convert(int num) {
        int pow = (num / 2) - 1;
        //System.out.println(num);
        //System.out.println(num/2);
        while (num != 0) {
            int quotient = num / 2;
            int remainder = num % 2;
            System.out.println(remainder);
            num = quotient;
            //System.out.println(num);
            //break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        convert(num);
    }
}
