package bai8_1;

public class MyIntStack {
    private int[] contents;
    private int tos; // Top of the stack
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor with default capacity
    public MyIntStack() {
        this(DEFAULT_CAPACITY);
    }

    // Constructor with custom capacity
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    // Push method with dynamic resizing
    public boolean push(int element) {
        if (isFull()) {
            increaseCapacity();
        }
        contents[++tos] = element;
        return true;
    }

    // Pop method with exception handling
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos--];
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return tos < 0;
    }

    // Check if the stack is full
    public boolean isFull() {
        return tos == contents.length - 1;
    }

    // Increase stack capacity dynamically
    private void increaseCapacity() {
        int newSize = contents.length * 2;
        int[] newArray = new int[newSize];
        System.arraycopy(contents, 0, newArray, 0, contents.length);
        contents = newArray;
    }

    // Display stack elements
    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= tos; i++) {
            System.out.print(contents[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(3);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        // Stack is full, test dynamic resizing
        stack.push(40);
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        stack.printStack();
    }
}

