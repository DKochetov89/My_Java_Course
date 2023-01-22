public class ThreadCreate {

    public static void main(String[] args) throws InterruptedException {

        // Runnable <--> Running <--> Waiting/Block
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);

        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);
        Thread.yield();

        // потоки помещаются в пул - последовательность может меняться, но можно setPriority()
        myThread1.start();
        thread.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("RUN MyThread1");
        method();
    }
    void method() {
        System.out.println("METHOD MyThread1");
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("RUN MyThread2");
        method();
    }
    void method() {
        System.out.println("METHOD MyThread2");
    }
}
