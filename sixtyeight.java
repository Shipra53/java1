//to print the elements of an array present on odd position
import java.util.Scanner;
public class sixtyeight{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{2,3,7,5,8,12};
        System.out.print("Array present on odd position: ");
        for(int i=0;i<a.length;i=i+2){
            System.out.print(a[i]+ " ");
        }}}