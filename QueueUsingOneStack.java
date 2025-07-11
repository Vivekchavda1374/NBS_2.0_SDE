import java.util.Stack;

public class QueueUsingOneStack {
    private Stack<Integer> stack;

    public QueueUsingOneStack() {
        stack = new Stack<>();
    }

    public void enqueue(int value) {
        stack.push(value);
    }

    public int dequeue() {
        if (stack.isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        int top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        }
        int item = dequeue();
        stack.push(top);
        return item;
    }

    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int top = stack.pop();
        if (stack.isEmpty()) {
            stack.push(top);
            return top;
        }
        int item = peek();
        stack.push(top);
        return item;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }


}
