import java.util.*;

public class ListTesting {

    public static void main(String[] args) {
        // extends AbstractList<E>
        // implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        List<String> arrayList = new ArrayList<>(100);
        Collections.sort(arrayList);

        // основные методы List
        arrayList.add(0, "1000");
        arrayList.remove(0);
        arrayList.clear();
        int listSize = arrayList.size();
        arrayList.subList(0, 4);
        arrayList.set(2, "new");
        arrayList.contains("Hello");

        // модфикация во время итерации
        for (String str: arrayList) {
            System.out.println(str);
            str.toUpperCase();
        }

        for (int i = 0; i <= arrayList.size(); i++) {
            arrayList.add(String.valueOf(i));
            arrayList.remove(i);
        }

        // бинарный поиск
        Collections.binarySearch(arrayList, "FIND_ME");

        // приведение к массива к листу
        String[] arr1 = {"1", "2" ,"3"};
        List<String> list = Arrays.asList(arr1);

        // extends AbstractSequentialList<E>
        // implements List<E>, Deque<E>, Cloneable, java.io.Serializable
        List<String> linkedList = new LinkedList<>();
        Collections.sort(linkedList);

        // extends AbstractList<E>
        // implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        List<String> vector = new Vector<>();
        Collections.sort(vector);

        // extends Vector<E>
        List<String> stack = new Stack<>();
        Collections.sort(stack);

        // новая реализация для синхронизации листа
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        Collections.sort(synchronizedList);
    }
}
