// public, protected, private, final
public class TestClass_1 {
    private int number_1 = 10;
    protected int number_2;
    int number_3;
    public int number_4;

    final int con1 = 1000;

    final void changeNumbers() {
        final int con2 = 2000;
    }

    final class TestClass_2 {}

    public int getNumber_1() {
        return number_1;
    }

    public void setNumber_1(int number_1) {
        this.number_1 = number_1;
    }

    public class InnerTestClass_1 {
        void showNumber() {
            System.out.println(TestClass_1.this.number_1);
            System.out.println(TestClass_1.this.number_2);
        }
    }
}
