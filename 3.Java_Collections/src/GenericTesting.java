import java.util.ArrayList;
import java.util.List;

public class GenericTesting {

    public static void main(String[] args) {
        // добавляем в лист 2 элемента
        SomeClass<Integer> someClass1 = new SomeClass<>(10);
        SomeClass<String> someClass2 = new SomeClass<>("qqq");
        List<SomeClass> list = new ArrayList<>();
        list.add(someClass1);
        list.add(someClass2);
        for (SomeClass some: list) {
            System.out.println(some.getT());
        }
        // применение методов
        someClass1.method(15);
        someClass2.setX("Hello");

        // wildcards
        GenParent<? extends NewClass> genParent1 = new GenParent<ChildNewClass>();
        GenParent<? super NewClass> genParent2 = new GenParent<Object>();
    }
}
class SomeClass <T> {
    T t;
    public SomeClass(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }

    <T> void method(T t) {}

    <X> X setX(X x) { return x; }
}

class NewClass <X extends SomeClass & Cloneable> { // наследование и реализация
    X x;

    public NewClass(X x) {
        this.x = x;
        x.getT(); // ураследованный метод
    }
}

class ChildNewClass extends NewClass {
    public ChildNewClass(SomeClass someClass) {
        super(someClass);
    }
}

// наследование
class Parent {}
class GenParent<T> extends Parent {}
class Child1<T> extends GenParent<T> {}
class Child2<X, Y> extends GenParent<Y> {}
class Child3<X> extends GenParent<Integer> {}