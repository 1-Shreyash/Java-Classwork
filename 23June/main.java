import java.util.ArrayList;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        ArrayList<pr> pl = new ArrayList<>();
        pl.add(new pr("Sahil", 1, 3));
        pl.add(new pr("Sam", 344, 10));
        pl.add(new pr("Shree", 3, 6));
        int sum = 0;
        for (pr p : pl) {
            sum += p.amt();
        }
        System.out.println("Price is:" + sum);
    }
}
