package exercises.stack.track_max_element;

import stack.pseudocode.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Exercise is taken from https://www.geeksforgeeks.org/tracking-current-maximum-element-in-a-stack/
 * <p>
 * Description:
 * <p>
 * Given a Stack, keep track of the maximum value in it.
 * The maximum value may be the top element of the stack,
 * but once a new element is pushed or an element is pop from the stack,
 * the maximum element will be now from the rest of the elements.
 * <p>
 */
public class TrackingStack implements Stack {

    private final List<Integer> stack;
    private int stackTopIndex;
    private int currentMaximumElement;
    private final List<Integer> trackingMaximumElements;

    public TrackingStack() {
        stackTopIndex = -1;
        stack = new ArrayList<>();
        trackingMaximumElements = new ArrayList<>();
    }

    @Override
    public void push(int element) {
        if (stackTopIndex == -1) {
            currentMaximumElement = element;
        }
        stack.add(element);
        stackTopIndex++;
        if (this.peek() > currentMaximumElement) {
            currentMaximumElement = this.peek();
            trackingMaximumElements.add(currentMaximumElement);
        } else {
            trackingMaximumElements.add(currentMaximumElement);
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int element = stack.remove(stackTopIndex);
        stackTopIndex--;
        trackingMaximumElements.add(currentMaximumElement);
        return element;
    }

    @Override
    public boolean isEmpty() {
        return stackTopIndex < 0;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stackTopIndex);
    }

    @Override
    public int size() {
        return stackTopIndex + 1;
    }

    public List getTrackingMaximumElementsList() {
        return trackingMaximumElements;
    }
}
