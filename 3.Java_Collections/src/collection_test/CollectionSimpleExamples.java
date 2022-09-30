package collection_test;

import java.util.*;

public class CollectionSimpleExamples {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1"); arrayList.add("2");
        arrayList.add("a"); arrayList.add("b");
        System.out.println("ArrayList:");
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.print("[" + arrayList.get(j) + "] ");
        }
        System.out.println("");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);
        linkedList.addFirst("first");
        linkedList.addLast("end");
        linkedList.add(2, "QQQ");
        linkedList.remove(2);
        System.out.println("LinkedList:");
        for (String str: linkedList) {
            System.out.print("[" + str + "] ");
        }
        System.out.println("");

        Deque<String> deque = new ArrayDeque<>();
        deque.addAll(arrayList);
        System.out.println("Deque:");
        deque.addFirst("first");
        deque.addLast("end");
        deque.pop();
        for (String str: deque) {
            System.out.print("[" + str + "] ");
        }
        System.out.println("");
        deque.push("QQQ");
        for (String str: deque) {
            System.out.print("[" + str + "] ");
        }
        System.out.println("");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("1");
        hashSet.add("b");
        System.out.println("HashSet:");
        Iterator<String> i = hashSet.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("1");
        treeSet.add("b");
        System.out.println("TreeSet:");
        for (String str: treeSet) {
            System.out.print(str + " ");
        }
        System.out.println("");

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one"); hashMap.put(2, "two");
        hashMap.put(3, "three"); hashMap.put(4, "four");
        System.out.println("HashMap:");
        System.out.println(hashMap);
        String str = hashMap.get(1);
        System.out.println(str);
        hashMap.remove(2);
        System.out.println(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one_tree");
        treeMap.put(0, "two_tree");
        treeMap.put(2, "three_tree");
        treeMap.put(44, "four_tree");
        System.out.println("TreeMap:");
        System.out.println(treeMap);
    }
}
