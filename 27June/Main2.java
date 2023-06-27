import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(5, .5F);
        hs.add("a");
        hs.add("g");
        hs.add("d");
        hs.add("j");
        hs.add("p");
        System.out.println("capacity is : " + hs.size());
        System.out.println(hs);
        System.out.println(hs.contains("g"));
        System.out.println(hs.remove("d"));
        System.out.println(hs.isEmpty());
        System.out.println(hs);
    }
}
