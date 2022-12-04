//to print the elements of an array present on even position
import java.util.Scanner;
public class sixtyseven{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{2,3,7,5,8,12};
        System.out.print("Array present on even position: ");
        for(int i=1;i<a.length;i=i+2){
            System.out.print(a[i]+ " ");
        }}}