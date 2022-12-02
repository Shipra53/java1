//to print elements of an array
import java.util.Scanner;
    public class sixtyfive{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{2,4,6,8,10};
        System.out.print("Elements of given array: ");
       for( int i=0;i<a.length;i++){
        System.out.print(a[i]+ "  ");
       }}}