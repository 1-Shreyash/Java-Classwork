class Main {
    public static void main(String[] args) {
        callme c = new callme();
        caller t1 = new caller(c, "hello");
        caller t2 = new caller(c, "world");
    }
}