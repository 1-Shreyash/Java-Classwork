import java.util.Comparator;

public class bookCompare implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.price - o1.price;
    }
}
