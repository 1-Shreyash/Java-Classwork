import java.util.LinkedList;
import java.util.*;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l.peek());
        Iterator itr = l.descendingIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("All before 3rd index");
        ListIterator litr = l.listIterator(3);
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
        System.out.println("Print in reverse");
        Collections.reverse(l);
        for (Integer i : l)
            System.out.println(i);
    }
}