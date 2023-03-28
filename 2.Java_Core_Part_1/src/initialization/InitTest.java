package initialization;

public class InitTest {
    public static void main(String[] args) {
        // third
        System.out.println("Inside main()");
        Cups.cup1.f(99);  // (1)
    }
    // second
    static Cups cups1 = new Cups();  // (2)
    static Cups cups2 = new Cups();  // (2)
}

class Cup {
    // second
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    // first block
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}
