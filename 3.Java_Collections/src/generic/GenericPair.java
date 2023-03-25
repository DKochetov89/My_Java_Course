package generic;

import java.util.function.Supplier;
public class GenericPair<T> {

    private T first;
    private T second;

    public GenericPair() { first = null; second = null; }
    public GenericPair(T first, T second) { this.first = first;  this.second = second; }
    public T getFirst() { return first; }
    public T getSecond() { return second; }

    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }

    public String toString() { return "(" + first + ", " + second + ")"; }

    public static <T> GenericPair<T> makePair(Supplier<T> constr) {
        return new GenericPair<>(constr.get(), constr.get());
    }

    public static <T> GenericPair<T> makePair(Class<T> cl) {
        try {
            return new GenericPair<>(cl.getConstructor().newInstance(),
                    cl.getConstructor().newInstance());
            }
        catch (Exception e) { return null; }
    }
}
