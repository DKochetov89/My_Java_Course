package finilize_test;

public class MainClass {
    public static void main(String args[]) {
        TestClass obj = new TestClass();
        System.out.println("Result of method() is " + obj.method());
        obj = null;

        System.gc();

        obj = new TestClass();
        System.out.println("Result of method() is " + obj.method());
        System.out.println("Ready");
    }
}
