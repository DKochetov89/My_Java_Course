import java.util.*;

public class QueueTesting {

    public static void main(String[] args) {
        // FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.add(12);
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.element();

        // FIFO LIFO
        Deque<Integer> deque = new LinkedList<>();
        deque.contains(13);
        Deque<Integer>integerDeque = new ArrayDeque<>();
        integerDeque.addFirst(100);
        integerDeque.getFirst();
    }
}
