package exercises.stack.track_max_element;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/* This class tests TrackingStack.java

 * Testing Examples:
 * <p>
 * Input : 4 19 7 14 20
 * Output : Max Values in stack are
 * 4 19 19 19 20
 * <p>
 * Input : 40 19 7 14 20 5
 * Output :  Max Values in stack are
 * 40 40 40 40 40 40
 * */
class TrackingStackTest {


    // Input : 40 19 7 14 20 5
    // Output :  Max Values in stack are
    // 40 40 40 40 40 40
    @Test
    public void test_getTrackingMaximumElementsList_firstSequence() {
        TrackingStack stack = new TrackingStack();
        fillStack(stack, new int[]{4, 19, 7, 14, 20});

        List trackingMaximumElements = stack.getTrackingMaximumElementsList();
        int[] trackingMaximumElementsArray = trackingMaximumElements.stream().mapToInt(i->(Integer)i).toArray();

        assertTrue(Arrays.equals(trackingMaximumElementsArray, new int[]{4, 19, 19, 19, 20}));
    }

    // Input : 4 19 7 14 20
    // Output : Max Values in stack are
    // 4 19 19 19 20
    @Test
    void test_getTrackingMaximumElementsList_secondSequence() {
        TrackingStack stack = new TrackingStack();
        fillStack(stack, new int[]{40, 19, 7, 14, 20, 5});

        List trackingMaximumElements = stack.getTrackingMaximumElementsList();
        int[] trackingMaximumElementsArray = trackingMaximumElements.stream().mapToInt(i->(Integer)i).toArray();

        assertTrue(Arrays.equals(trackingMaximumElementsArray, new int[]{40, 40, 40, 40, 40, 40}));
    }

    // Input : empty stack
    // Output : empty
    @Test
    void test_getTrackingMaximumElementsList_thirdSequence() {
        TrackingStack stack = new TrackingStack();
        List trackingMaximumElements = stack.getTrackingMaximumElementsList();
        int[] trackingMaximumElementsArray = trackingMaximumElements.stream().mapToInt(i->(Integer)i).toArray();

        assertTrue(Arrays.equals(trackingMaximumElementsArray, new int[]{}));
    }

    // Input : -1 0 0 -2 10 11 12 -15 17
    // Output : -1 0 0 0 10 11 12 12 17
    @Test
    void test_getTrackingMaximumElementsList_fourthSequence() {
        TrackingStack stack = new TrackingStack();
        fillStack(stack, new int[]{-1, 0, 0, -2, 10, 11, 12, -15, 17});

        List trackingMaximumElements = stack.getTrackingMaximumElementsList();
        int[] trackingMaximumElementsArray = trackingMaximumElements.stream().mapToInt(i->(Integer)i).toArray();

        assertTrue(Arrays.equals(trackingMaximumElementsArray, new int[]{-1,0,0,0,10,11,12,12,17}));
    }

    private void fillStack(TrackingStack stack, int[] elements){
        for (int element : elements) {
            stack.push(element);
        }
    }
}