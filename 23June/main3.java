import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main3 {
    public static void main(String[] args) {
        ArrayList<pr> pl = new ArrayList<>();
        pl.add(new pr("Sahil", 1, 3564));
        pl.add(new pr("Sam", 344, 10));
        pl.add(new pr("Shree", 34, 6));
        pl.add(new pr("Ram", 3, 6));
        pl.add(new pr("Soham", 3, 63));

        Collections.sort(pl, new productCompare());
        // Collections.sort(pl);
        System.out.println("Sorted:");
        for (pr p : pl)
            p.display();
    }
}
