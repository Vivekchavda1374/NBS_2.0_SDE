public class QueueImplementUsingArrays {
    private int[] queue;
    private int front, rear, capacity;

    public QueueImplementUsingArrays(int size) {
        queue = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue overflow");
            return;
        }
        queue[++rear] = value;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue underflow");
            return -1;
        }
        return queue[front++];
    }

    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public int size() {
        return rear - front ;
    }
}
