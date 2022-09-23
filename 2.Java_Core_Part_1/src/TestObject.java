public class TestObject {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1.toString());
        System.out.println(object1.getClass());
        System.out.println(object1.equals(object2));
        System.out.println(object1.hashCode());
        object2.notify();
        try {
            object2.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
