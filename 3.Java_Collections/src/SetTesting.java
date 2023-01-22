import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {

    public static void main(String[] args) {
        // extends AbstractSet<E>
        // implements Set<E>, Cloneable, java.io.Serializable
        // не сохраняет порядок добавления элементов в коллекцию
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.clear();
        int num = hashSet.size();
        hashSet.remove(0);
        boolean con = hashSet.contains(100);

        // extends HashSet<E>
        // implements Set<E>, Cloneable, java.io.Serializable
        // хранит элементы в порядке добавления
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // extends AbstractSet<E>
        // implements NavigableSet<E>, Cloneable, java.io.Serializable
        // отсортированный и возрастающий порядок
        Set<Integer> treeSet = new TreeSet<>();
    }
}
