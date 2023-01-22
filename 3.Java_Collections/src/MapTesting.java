import java.util.*;

public class MapTesting {

    public static void main(String[] args) {
        // extends AbstractMap<K,V>
        // implements Map<K,V>, Cloneable, Serializable
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.clear();
        hashMap.get(1);
        hashMap.containsKey(2);
        hashMap.containsValue("QQQ");
        hashMap.remove(2, "34");
        hashMap.replace(2, "10");

        // extends HashMap<K,V>
        // implements Map<K,V>
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // extends AbstractMap<K,V>
        // implements NavigableMap<K,V>, Cloneable, java.io.Serializable
        Map<Integer, String> treeMap = new TreeMap<>();

        // extends Dictionary<K,V>
        // implements Map<K,V>, Cloneable, java.io.Serializable
        // методы синхронизированы в отличии от HashMap
        Map<Integer, String> hashTable = new Hashtable<>();

        Map<Integer, String> syncHashMap = Collections.synchronizedMap(new HashMap<>());
    }
}
