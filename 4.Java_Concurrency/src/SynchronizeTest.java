public class SynchronizeTest {

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.i = 0;

        MyThread myThread1 = new MyThread();
        myThread1.setResource(resource);
        MyThread myThread2 = new MyThread();
        myThread2.setResource(resource);

        myThread1.start();
        myThread1.join();
        myThread2.start();
        myThread2.join();

        System.out.println(resource.i);
    }
}

class MyThread extends Thread {
    Resource resource;
    @Override
    public void run() {
        resource.changeI();
        resource.change();
    }
    public void setResource(Resource resource) {
        this.resource = resource;
    }
}

class Resource {
    int i;
    synchronized void changeI() {
        int i = this.i;
        i++;
        this.i = i;
    }
    void change() {
        synchronized (this) {
            System.out.println("Synchronized" + Thread.currentThread().getName());
        }
    }
}
