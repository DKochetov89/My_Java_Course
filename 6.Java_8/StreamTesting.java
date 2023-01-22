import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTesting {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one"); list.add("two");
        list.add("three"); list.add("four");

        Stream<String> stream = list.stream(); // один поток
        stream.forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(list.stream().findFirst()); // открываем второй, иначе не будет работать

        // фильтр и преобразование в коллекцию
        Set<String> stringSet = list.stream().filter(x -> x.equals("one")).collect(Collectors.toSet());
        System.out.println(stringSet);

        // преобразование элементов стрима
        list.stream().map(String::toUpperCase).forEach(x -> System.out.print(x + " "));
        System.out.println();

        // преобразование нескольких коллекций в одну последовательность
        Stream.of(2, 3, 0, 1, 3).
                flatMapToInt(x -> IntStream.range(0, x)).
                forEach(System.out::print); // method references, ссылка на метод класса
        System.out.println();

        // сравнение занчений
        int xMin = Stream.of(1, 2, 3).min(Comparator.comparing(x -> x)).get();
        int xMax = Stream.of(1, 2, 3).max(Comparator.comparing(x -> x)).get();
        System.out.println(xMin + " " + xMax);

        // суммирование элементов массива
        int sumElements = Stream.of(10, 1, 2, 3).
                reduce(0, (acc, elem) -> acc + elem); // можно применить method references
        System.out.println(sumElements);

        // сортировка
        Stream.of(10, 12, 3, 94, 55).sorted().forEach(System.out::print);
        System.out.println();

        // кол-во элементов
        int number = (int) Stream.of(10, 12, 3, 94, 55).count();
        System.out.println(number);

        // для ускорения работы parallelStream, но зависит от ТТХ машины
        List<Integer> integerList1 = new ArrayList<>();
        for (int i = 0; i < 20000000; i++) {
            integerList1.add(i);
            integerList1.add(20000000 - i);
        }
        integerList1.parallelStream().sorted();
    }
}
