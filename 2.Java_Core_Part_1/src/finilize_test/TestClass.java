package finilize_test;

public class TestClass {
    public int method() {
        try {
            System.out.println("Method() called");
            throw new Exception("");
        } catch (Exception e) {
            System.out.println("Exception in method()");
            return 1000;
        } finally {
            System.out.println("Finally in method() ");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize()");
        super.finalize();
    }
}
