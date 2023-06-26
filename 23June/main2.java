import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(16);
        arr.add(14);
        arr.add(13);
        arr.add(121);
        arr.add(13);
        arr.add(165);
        Collections.sort(arr);
        System.out.println("The ascending order:");
        for (Integer i : arr)
            System.out.println(i);
        Collections.sort(arr, new descCompare());
        System.out.println("The descending order:");
        for (Integer i : arr)
            System.out.println(i);
        pr p = new pr("hi ", 34, 5);
        System.out.println(p);

    }
}
