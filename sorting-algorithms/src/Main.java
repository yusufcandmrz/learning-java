import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int[] selectionSort(int[] array) {
        int tempNumber;
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            int smallestNumberIndex = currentIndex;
            for (int nextIndex = currentIndex + 1; nextIndex < array.length; nextIndex++) {
                if (array[nextIndex] < array[smallestNumberIndex]) {
                    smallestNumberIndex = nextIndex;
                }
            }
            if (smallestNumberIndex != currentIndex) {
                tempNumber = array[currentIndex];
                array[currentIndex] = array[smallestNumberIndex];
                array[smallestNumberIndex] = tempNumber;
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int tempNumber;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tempNumber = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempNumber;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int tempNumber;
        for (int i = 1; i < array.length; i++) {
            tempNumber = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > tempNumber) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tempNumber;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 2, 4};
        // System.out.println(Arrays.toString(selectionSort(array)));
        // System.out.println(Arrays.toString(bubbleSort(array)));
        // System.out.println(Arrays.toString(insertionSort(array)));
    }
}