//to copy all elements of one array into another array
import java.util.Scanner;
public class sixtyone{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
            int [] a=new int[]{2,4,6,8};
            int [] b=new int[a.length];
            for(int i=0;i<a.length;i++){
                b[i]=a[i];
            }
            System.out.println("Elements of copied array: ");
            for(int i=0;i<b.length;i++){
            System.out.print(b[i]+ " ");
        }}}