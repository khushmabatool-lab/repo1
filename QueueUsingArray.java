public class QueueUsingArray {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    // Insert an element into the queue
    static void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full!");
        } else {
            queue[++rear] = value;
            System.out.println(value + " added to queue.");
        }
    }

    // Remove an element from the queue
    static void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println(queue[front++] + " removed from queue.");
        }
    }

    // Display queue elements
    static void display() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();

        dequeue();

        display();
    }
}
