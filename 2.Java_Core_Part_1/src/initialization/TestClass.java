package initialization;

public class TestClass {

    static {
        System.out.println("Static initializer");
    }

    {
        System.out.println("Non-static initializer");
    }
    public void method() {
        System.out.println("method() called");
    }
}
