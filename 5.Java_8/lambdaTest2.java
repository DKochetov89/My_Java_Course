import java.util.Comparator;
import java.util.function.BiFunction;

public class lambdaTest2 {
    public static void main(String[] args) {
        // с параметрами
        Comparator<String> stringComparator1 = (String firstStr, String secondStr) -> {
            if (firstStr.length() < secondStr.length()) return -1;
            else if (firstStr.length() > secondStr.length()) return 1;
            else return 0;
        };
        System.out.println(stringComparator1.compare("Asia", "Africa"));

        // отсутсвие параметров
        Runnable runnable =() -> {
            for (int i = 100; i >= 0; i--)
                System.out.println(i);
        };
        runnable.run();

        // функциональный интерфейс для сравнения строк
        BiFunction<String, String, Integer> comp
                = (first, second) -> first.length() - second.length();
        System.out.println(comp);

        // конкатенация
        BiFunction<String, String, String> concat = String::concat;

        // сумма
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;

        // вывод посредством forEach
        var walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
    }
}
