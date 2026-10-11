public class StackUsingLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    // Insert a node at the top
    static void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed into stack.");
    }

    // Remove the top node
    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    // Display stack elements
    static void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;

        System.out.print("Stack elements: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        push(100);
        push(200);
        push(300);

        display();

        pop();

        display();
    }
}
