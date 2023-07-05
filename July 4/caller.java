public class caller implements Runnable {
    String s;
    callme ob;
    Thread t;

    caller(callme ob, String s) {
        this.ob = ob;
        this.s = s;
        t = new Thread(this);
        t.start();
        this.ob = ob;
    }

    public void run() {
        synchronized (ob) {
            ob.call(s);
        }
    }
}