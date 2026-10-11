public class QueueUsingLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    // Insert a node at the rear
    static void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " added to queue.");
    }

    // Remove a node from the front
    static void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println(front.data + " removed from queue.");

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Display queue elements
    static void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;

        System.out.print("Queue elements: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        enqueue(11);
        enqueue(22);
        enqueue(33);

        display();

        dequeue();

        display();
    }
}

