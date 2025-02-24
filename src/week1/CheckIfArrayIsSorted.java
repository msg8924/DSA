package week1;
import java.util.Arrays;
import java.util.Random;


public class CheckIfArrayIsSorted {

    //Time Complexity - O(n^2) and Space Complexity - O(1)
    private static boolean isSorted(int[] arr) {
        if (arr.length == 0) return true;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] >  arr[i]) return false;
            }
        }
        return true;
    }

    //Time Complexity - O(n) and Space Complexity - O(1)
    private static boolean isSortedEfficient(int[] arr) {
        if (arr.length == 0) return true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) return false;
        }
        return true;
    }

    private static int[] generateRandomIntArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void main(String[] args) {
        int size = 10; // Size of the array
        int min = 1;  // Minimum value for the random integers
        int max = 100; // Maximum value for the random integers

        int[] randomArray = generateRandomIntArray(size, min, max);
        int[] randomArrayCopy = Arrays.copyOf(randomArray, randomArray.length);
        Arrays.sort(randomArrayCopy);

        System.out.printf("This array %s is sorted %b", Arrays.toString(randomArray),isSorted(randomArray));
        System.out.println();
        System.out.printf("This array %s is sorted %b", Arrays.toString(randomArrayCopy),isSorted(randomArrayCopy));

        System.out.println();
        System.out.printf("This array %s is sorted %b", Arrays.toString(randomArray),isSortedEfficient(randomArray));
        System.out.println();
        System.out.printf("This array %s is sorted %b", Arrays.toString(randomArrayCopy),isSortedEfficient(randomArrayCopy));


    }
}
