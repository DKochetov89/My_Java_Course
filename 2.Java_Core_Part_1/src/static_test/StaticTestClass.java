package static_test;

public class StaticTestClass {
    static int id;

    static void method(int a) {}

    static void method(int a, int b) {}

    static {
        System.out.println("initialization");
    }

    static class InnerStaticTestClass {}
}
