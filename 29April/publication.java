public class publication {
    String title;
    float price;
    void setdata(String t, float pr){
        title = t;
        price = pr;
    }
    void display(){
        System.out.println("Title:"+title+" Price:"+price);
    }
}
class book extends publication{
    int pgcount;
    void setdata(String t, float pr, int pc){
        super.setdata(t, pr);
        pgcount = pc;
    }
    void display(){
        System.out.println("Title:"+title+" Price:"+price+" Page_count:"+pgcount);
    }
}
class tape extends publication{
    float plytime;
    void setdata(String t, float pr, float pt){
        super.setdata(t, pr);
        plytime = pt;
    }
    void display(){
        System.out.println("Title:"+title+" Price:"+price+" Playtime:"+ plytime);
    }
}