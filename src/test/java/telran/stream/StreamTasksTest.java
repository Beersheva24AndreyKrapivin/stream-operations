package telran.stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static telran.stream.StreamTasks.*;

public class StreamTasksTest {

    @Test
    void shuffleTest() {
        // testing of method shuffle of StreamTasks class
        int[] expected = {-5, -4, -3, -1, 0, 2, 5, 7, 20};
        int[] actual1 = shuffle(Arrays.copyOf(expected, expected.length));
        int[] actual2 = shuffle(Arrays.copyOf(expected, expected.length));
        
        assertFalse(Arrays.equals(expected, actual1));
        assertFalse(Arrays.equals(expected, actual2));
        assertFalse(Arrays.equals(actual1, actual2));

        Arrays.sort(expected);
        Arrays.sort(actual1);
        Arrays.sort(actual2);
        
        assertArrayEquals(expected, actual1);
        assertArrayEquals(expected, actual2);
        assertArrayEquals(actual1, actual2);
    }
}
