public class callme {
    /* synchronized */ void call(String s) {
        try {
            System.out.printf("[");
            System.out.printf(s);
            Thread.sleep(1000);
            System.out.println("]");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
