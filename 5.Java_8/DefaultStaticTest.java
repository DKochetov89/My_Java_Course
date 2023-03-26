public class DefaultStaticTest implements A {

    public static void main(String[] args) {
        System.out.println(A.add(1, 2));
        DefaultStaticTest defaultStaticTest = new DefaultStaticTest();
        defaultStaticTest.printHello();
        defaultStaticTest.printMessage();
    }

    @Override
    public void printHello() {
        System.out.println("Hello");
    }
}

interface A {
    static int add(int a, int b) {
        return a+b;
    }

    void printHello();

    default void printMessage() {
        System.out.println("MESSAGE");
    }
}
