//swap value without using third variable
import java.util.Scanner;
class eight{
    public static void main(String[] args)
     {
        Scanner obj = new Scanner(System.in);
        int a=10;
        int b = 20;
        System.out.println("swap value");
         a=b;
         b=a;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        
        
    }
}