package week1;

import java.util.Scanner;

public class BinaryToDecimalConversion {

    public static int convert(String binary) {
        int binaryNum = Integer.parseInt(binary);
        int pow = ((int)Math.log10(binaryNum));
        int result = 0;
        int i = 0;
        while(i <= pow) {
            int remainder = binaryNum % 10;
            int number  =(int)(remainder * Math.pow(2,i));
            result += number;
            binaryNum /= 10;
            i = i + 1;
        }
        System.out.printf("%s represented as a decimal %d",binary, result);
        return result;

    }

    public static int convertEfficient(String binary) {
        int result = 0;
        for(int i = 0; i < binary.length(); i++) {
            int digit = (binary.charAt(i)-'0');
            result += (int) (digit * Math.pow(2,binary.length() - i -1));
        }
        System.out.printf("%s represented as a decimal %d",binary, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary = DecimalToBinaryConversion.convert(num);
        System.out.println();
        convert(binary);
        System.out.println();
        convertEfficient(binary);


    }
}
