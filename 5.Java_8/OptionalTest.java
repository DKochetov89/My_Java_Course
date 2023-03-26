import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional1 = getSome();
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(null);

        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
    }

    static Optional<String> getSome() {
        return null;
    }
}
