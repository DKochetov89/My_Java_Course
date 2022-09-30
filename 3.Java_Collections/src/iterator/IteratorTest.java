package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {

        String[] strings = {"1", "2", "3", "a", "b", "C"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        Iterator<String> i = arrayList.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("");

        Iterable<String> stringIterable = new ArrayList<>(arrayList);
        for (String str: stringIterable) {
            System.out.print(str + " ");
        }
    }
}
