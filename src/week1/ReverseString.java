package week1;

import java.util.Scanner;

public class ReverseString {

    private static String reverse(String string) {
        StringBuilder sb = new StringBuilder();
        for(int i = string.length()-1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.printf("Reverse of %s is %s", string, reverse(string));
        sc.close();
    }
}
