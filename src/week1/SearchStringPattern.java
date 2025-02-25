package week1;

import java.util.Scanner;

public class SearchStringPattern {

    private static void count(String string, String subString) {
        int count = 0;
        int subStringLength = subString.length();
        int index = (string.length() - subString.length()) - 1;
        for (int i = 0; i < index; i++) {
            String pattern = string.substring(i,(i+subStringLength));
            if (pattern.equals(subString)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.printf("%s is found in %s %d times", subString, string, count);
        } else {
            System.out.printf("%s is not found in %s", subString, string);
        }
    }

    private static void printIndexes(String string, String subString) {
      int pos = string.indexOf(subString);
      while (pos >= 0) {
          System.out.print(pos + " ");
          pos = string.indexOf(subString,pos+1);
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String subString = sc.nextLine();
        count(string, subString);
        System.out.println();
        printIndexes(string, subString);
        sc.close();

    }
}
