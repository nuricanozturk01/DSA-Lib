package nuricanozturk.dev.util;

import nuricanozturk.dev.util.datastructures.linear.StackArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StackArrayTest {

    private static final String[] stringArr = new String[]{"Nuri", "Can", "ozturk", "stack", "array"};
    private StackArray<String> stack;

    @BeforeEach
    public void setup() {
        stack = new StackArray<>();
        Arrays.stream(stringArr).forEach(stack::push);
    }

    @DisplayName("Validate Push Operation Size")
    @Test
    public void testPushOperationSize() {
        Assertions.assertEquals(stringArr.length, stack.getSize());
    }

    @DisplayName("Validate Stack Items")
    @Test
    public void testStackItems() {
        int index = stringArr.length - 1;
        while (!stack.isEmpty()) {
            String item = stack.pop().orElse(null);
            Assertions.assertEquals(stringArr[index--], item);
        }
    }

    @DisplayName("Pop all item and check size of stack")
    @Test
    public void popAndSizeZeroTest() {
        while (!stack.isEmpty())
            stack.pop();
        Assertions.assertEquals(0, stack.getSize());
    }
}
