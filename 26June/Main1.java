import java.util.TreeSet;

class Main1 {
    public static void main(String[] args) {
        TreeSet<Character> tset = new TreeSet<>();
        for (int i = 'a'; i <= 'z'; i++) {
            tset.add((char) i);
        }
        System.out.println(tset.contains('c'));// is 'c' int tset
        System.out.println(tset.ceiling('c'));// returns next element
        System.out.println(tset.floor('c'));// returns just before element
        System.out.println(tset.first());// returns first element
        System.out.println(tset.last());// returns last element
        System.out.println(tset.lower('p'));// returns all elements before p
    }
}