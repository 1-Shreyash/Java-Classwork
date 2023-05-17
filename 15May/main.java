import java.io.IOException;
import java.util.Scanner;

// Create a function to take input from user 10 positive numbers. If the number entered is less than 0 throw Arithemetic eception. The exception should be handled in main() class. 
public class main {
    static void checkInput(int a) throws IOException{
        if(a<0){
            throw new IOException("Number is less than 0");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int[] a = new int[10];
            for( int i=0;i<10;i++){
                int t = s.nextInt();
                checkInput(t);
                a[i] = t;
            }
        }
        catch(IOException e){
            System.out.println("Exception caught " + e);
        }
    }

}
