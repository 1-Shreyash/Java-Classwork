class newThread implements Runnable {
    Thread t;

    public newThread(String name) {
        t = new Thread(this, name);
        System.out.println("executing child thread...");
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println(t.getName() + " " + i);
                t.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("thread interrupted");
            }
        }
    }
}

public class q2 {
    public static void main(String a[]) {
        Thread t = Thread.currentThread();
        t.setName("Main Thread");
        System.out.println("executing main thread");
        newThread t1 = new newThread("Thread1");
        Thread t2 = Thread.currentThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(t2.getName() + " " + i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }

}
