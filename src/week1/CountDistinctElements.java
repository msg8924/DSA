package week1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountDistinctElements {

    // Time Complexity - O(n^2) and Space Complexity - O(n)
    public static int countDistinctElements(int[] arr) {
        int[] elements = new int[arr.length];
        int index = 0;
        boolean add = true;
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (elem == elements[j]) {
                    add = false;
                    break;
                }
            }
            if (add) {
                elements[index] = elem;
                index++;
            }
            add = true;
        }
        return index;
    }

    //Time Complexity - O(n^2) and Space Complexity - O(1)
    public static int countDistinctElementsEfficient(int[] arr) {
        int count = 0;
        if (arr.length == 0) return count;
        count++;
        boolean add = true;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    add = false;
                    break;
                }
            }
            if (add) {
                count++;
            }
            add = true;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }*/

        int[] arr = {10,10,10,20,30,40,40,50,50,60};


        int elements = countDistinctElements(arr);
        int elementsEfficient = countDistinctElementsEfficient(arr);

        System.out.printf("Count of distinct elements in array %s is %d", Arrays.toString(arr), elements);
        System.out.println();
        System.out.printf("Count of distinct elements in array %s is %d", Arrays.toString(arr), elementsEfficient);


    }
}
