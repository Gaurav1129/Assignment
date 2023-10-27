// First Questtion -->

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create a new array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        // Method to shuffle this new array
        shuffle(arr);

        System.out.print("Shuffled Array is" + Arrays.toString(arr));
    }

    public static void shuffle(int arr[]) {
        int n = arr.length;

        // Create an instance of random class
        Random random = new Random();

        for (int i = 0; i < n; i++) {

            // Method for finding random index
            int randomIdx = i + random.nextInt(n - i);

            // Shuffle elements by swapping
            int randomEle = arr[randomIdx];
            arr[randomIdx] = arr[i];
            arr[i] = randomEle;
        }
    }
}