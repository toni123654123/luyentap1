public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enqueue(4);
        myQueue.dequeue();
        myQueue.enqueue(3);
        myQueue.enqueue(2);
        myQueue.enqueue(22);
        myQueue.dequeue();
        myQueue.enqueue(12);
        myQueue.enqueue(20);
        myQueue.enqueue(2);
    }
}
