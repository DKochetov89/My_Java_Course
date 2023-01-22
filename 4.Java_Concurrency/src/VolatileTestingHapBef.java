public class VolatileTestingHapBef {
    volatile static int a = 0;
    volatile static int b = 0;

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void start() {
                int r1 = a;
                b = 2;
                System.out.println("r1 = " + r1);
            }
        }.start();

        new Thread() {
            @Override
            public void start() {
                int r2 = b;
                a = 1;
                System.out.println("r2 = " + r2);
            }
        }.start();

        System.out.println("a and b = " + a + " " + b);
    }
}
