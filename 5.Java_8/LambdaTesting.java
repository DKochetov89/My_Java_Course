import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTesting {
    public static void main(String[] args) {
        // сокращение кода для реализации интерфейса
        Runnable runnable = () -> System.out.println("runnable");
        runnable.run();

        // интерфейс для проверки соблюдения некоторого условия
        Predicate<Integer> predicate = x -> x >= 10;
        System.out.println(predicate.test(11));

        // принимает в качестве входного аргумента объект, совершает некоторые действия,
        // но при этом ничего не возвращает
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(10);

        // принимает аргумент и приводит его к объекту другого типа
        Function<Integer, String> function = x -> x.toString();
        System.out.println(function.apply(5));

        // не принимает никаких аргументов, но возвращает некоторый объект
        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());
    }
}