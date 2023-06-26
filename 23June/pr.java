public class pr implements Comparable<pr> {
    String name;
    int price, quantity;

    pr(String n, int p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    void display() {
        System.out.println("Name : " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    int amt() {
        return price * quantity;
    }

    @Override
    public int compareTo(pr o) {
        if (quantity > o.quantity)
            return 1;
        else if (quantity < o.quantity)
            return -1;
        return 0;
    }
}
