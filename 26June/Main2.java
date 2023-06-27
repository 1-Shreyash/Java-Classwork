import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<Book> tset = new TreeSet<>(new bookCompare());
        tset.add(new Book("Rich Dad Poor Dad", "1231", "Richard Kiyosaki", 34));
        tset.add(new Book("The Great Apes", "1230", "Henry", 653));
        tset.add(new Book("Ramayan", "1232", "Valmiki", 32));
        // for (Book b : tset) {
        // b.display();
        // }
        System.out.println(tset);

    }
}
