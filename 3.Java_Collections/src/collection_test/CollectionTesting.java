import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class CollectionTesting {

    public static void main(String[] args) {

        // extends Iterable<E> SE1.5, Iterator SE1.2
        Collection<String> stringCollection = new ArrayList<>();
        System.out.println(stringCollection.getClass());

        // extends Collection<E>
        List<String> stringList = new ArrayList<>();
        System.out.println(stringList.getClass());
        Set<String> stringSet = new HashSet<>();
        System.out.println(stringSet.getClass());
        Queue<String> stringQueue = new SynchronousQueue<>();
        System.out.println(stringQueue.getClass());

        // не наследуется и не реализует
        Map<Integer, String> integerStringMap = new HashMap<>();
        System.out.println(integerStringMap.getClass());

    }
}
