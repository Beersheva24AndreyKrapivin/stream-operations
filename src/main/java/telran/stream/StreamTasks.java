package telran.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamTasks {
    public static int[] shuffle(int[] arr) {
        // only one pipeline for getting new array of int's
        // with all numbers from a given array but with different order
        // each method call returns new array in some random order

        return IntStream.range(0, arr.length).map(i -> {
            int randomIndex = new Random().nextInt(arr.length - i) + i;
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            return temp;
        }).toArray();

    }
}
