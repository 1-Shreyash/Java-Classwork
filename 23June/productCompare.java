import java.util.Comparator;

public class productCompare implements Comparator<pr> {
    @Override
    public int compare(pr o1, pr o2) {
        if (o1.quantity > o2.quantity)
            return 1;
        else if (o1.quantity < o2.quantity)
            return -1;
        else {
            if (o1.price > o2.price)
                return 1;
            else if (o1.price < o2.price)
                return -1;
            return 0;
        }
    }
}
