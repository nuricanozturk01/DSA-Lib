package nuricanozturk.dev.util.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.range;
import static nuricanozturk.dev.util.algorithms.sort.SortAlgorithms.bubbleSort;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BubbleSortTest {
    private Integer[] numbersMinToMax;

    @BeforeEach
    public void initArr() {
        numbersMinToMax = new Integer[]{12, 3, 2, 64, 7, 17343, 13, 213, 7451, 332, 0};
    }

    @Test
    @DisplayName("Min to Max test")
    public void bubbleSortMinToMaxTest() {
        bubbleSort(numbersMinToMax, (num1, num2) -> num1 > num2);

        assertFalse(range(0, numbersMinToMax.length).allMatch(i -> numbersMinToMax[i] > numbersMinToMax[i + 1]));

        stream(numbersMinToMax).forEach(System.out::println);
    }

    @Test
    @DisplayName("Max to Min test")
    public void bubbleSortMaxToMinTest() {
        bubbleSort(numbersMinToMax, (num1, num2) -> num1 < num2);

        assertFalse(range(0, numbersMinToMax.length).allMatch(i -> numbersMinToMax[i] < numbersMinToMax[i + 1]));

        stream(numbersMinToMax).forEach(System.out::println);
    }
}
