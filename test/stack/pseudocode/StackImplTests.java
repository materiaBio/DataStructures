package stack.pseudocode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackImplTests {

    @Test
    public void testStack(){

        StackImpl stack = new StackImpl();

        stack.push(7);
        stack.push(9);
        stack.push(1);
        stack.push(5);

        assertEquals(stack.peek(), 5);
        assertEquals(stack.size(), 4);
        assertEquals(stack.isEmpty(), false);

        int element;
        element = stack.pop();
        assertEquals(5, element);
        element = stack.pop();
        assertEquals(1, element);

        assertEquals(stack.peek(), 9);
        assertEquals(stack.size(), 2);
        assertEquals(stack.isEmpty(), false);

        element = stack.pop();
        assertEquals(9, element);
        element = stack.pop();
        assertEquals(7, element);

        assertEquals(stack.size(), 0);
        assertEquals(stack.isEmpty(), true);

        try {
            stack.pop();
        } catch (StackOverflowError overflowError) {
            assertEquals("Stack is empty", overflowError.getMessage());
        }
    }
}
