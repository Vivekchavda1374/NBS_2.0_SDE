public class StackUsingOneQueue {
    private QueueImplementUsingArrays queue;

    public StackUsingOneQueue(int size) {
        queue = new QueueImplementUsingArrays(size);
    }

    public void push(int value) {
        int size = queue.size();
        queue.enqueue(value);
        for (int i = 0; i < size; i++) {
            queue.enqueue(queue.dequeue());
        }
    }

    public int pop() {
        return queue.dequeue();
    }

    public int peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

   }
