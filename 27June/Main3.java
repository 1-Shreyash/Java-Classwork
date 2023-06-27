import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        HashSet<Book> hs = new HashSet<>(5, 0.5F);
        hs.add(new Book("Atomic Habits", "127", "James Clear", 390));
        hs.add(new Book("Rich Dad Poor Dad", "125", "Richard Kiyosaki", 340));
        hs.add(new Book("Ramayan", "1232", "Valmiki", 342));
        System.out.println(hs);
    }
}