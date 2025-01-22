import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static int[] selectionSort(int[] array) {
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            int smallestNumberIndex = currentIndex;
            for (int nextIndex = currentIndex + 1; nextIndex < array.length; nextIndex++) {
                if (array[nextIndex] < array[smallestNumberIndex]) {
                    smallestNumberIndex = nextIndex;
                }
            }
            if (smallestNumberIndex != currentIndex) {
                int tempNumber = array[currentIndex];
                array[currentIndex] = array[smallestNumberIndex];
                array[smallestNumberIndex] = tempNumber;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 2, 4};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}