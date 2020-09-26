public class MyQueue {
    private int capactity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize) {
        this.capactity = queueSize;
        queueArr = new int[this.capactity];
    }

    public boolean isQueueFull() {
        boolean status = true;
        if (currentSize == capactity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = true;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println(item);
        } else {
            tail++;
            if (tail == capactity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println(item);
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("=))");
        } else {
            head++;
            if (head == capactity - 1) {
                System.out.println(queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println(queueArr[head - 1]);
            }
            currentSize--;
        }

    }
}

