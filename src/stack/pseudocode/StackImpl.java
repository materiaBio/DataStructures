package stack.pseudocode;

public class StackImpl implements Stack {

    private final int[] stack;
    private int stackTop;

    public StackImpl() {
        stackTop = 0;
        stack = new int[100];
    }

    /**
     * PUSH(ELEMENT)
     * 1 STACK.TOP = STACK.TOP + 1
     * 2 STACK[STACK.TOP] = ELEMENT
     * @param element
     */
    public void push(int element)  {
        stackTop = stackTop + 1;
        stack[stackTop] = element;
    }

    /**
     * POP()
     * 1 if ISEMPTY() == TRUE
     * 2 ERROR “underflow”
     * 3 else STACK.TOP = STACK.TOP - 1
     * 4 return STACK[STACK.TOP + 1]
     * @return delete top element
     */
    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Stack is empty");
        } else {
            stackTop = stackTop - 1;
            return stack[stackTop + 1];
        }
    }

    /**
     * ISEMPTY()
     * 1 if STACK: TOP == 0
     * 2 return TRUE
     * 3 else return FALSE
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return stackTop == 0;
    }

    /**
     * PEEK()
     * 1 return STACK[STACK.TOP]
     * @return element at the top of the stack
     */
    public int peek() {
        return stack[stackTop];
    }

    /**
     * SIZE()
     * 1 return STACK.TOP
     * @return stack size
     */
    public int size() {
        return stackTop;
    }
}
