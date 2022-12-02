//to print the elements of an array in reverse order
import java.util.Scanner;
public class sixtysix{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{2,4,6,8,10,12,14,16};
        System.out.print("Given array in reverse order: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+ " ");
        }}}