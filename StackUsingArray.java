public class StackUsingArray {

    static int[] stack = new int[5];
    static int top = -1;

    // Insert an element into the stack
    static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Remove the top element
    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }

    // Display stack elements
    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack elements: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        display();

        pop();

        display();
    }
}
