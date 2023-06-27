public class Book implements Comparable<Book> {
    String title, bid, auth;
    int price;

    Book(String tit, String Bid, String Auth, int pr) {
        title = tit;
        bid = Bid;
        auth = Auth;
        price = pr;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title); // by using compareTo method of String class
    }

    // void display() {
    // }
    public String toString() {
        return "Book : " + title + ", Book id : " + bid + ", Author : " + auth + ", Price:" + price;
    }
}
