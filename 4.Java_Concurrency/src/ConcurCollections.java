import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ConcurCollections {
    public static void main(String[] args) {

        // A thread-safe variant of ArrayList in which all mutative operations (add, set, and so on)
        // are implemented by making a fresh copy of the underlying array.
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("first"); // ReentrantLock lock

        // A Set that uses an internal CopyOnWriteArrayList for all of its operations.
        Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add("first");

        // An optionally-bounded blocking deque based on linked nodes.
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
        BlockingQueue<String> blockingQueue1 = new ArrayBlockingQueue<>(30);

        // A hash table supporting full concurrency of retrievals and high expected concurrency for updates.
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

    }
}
