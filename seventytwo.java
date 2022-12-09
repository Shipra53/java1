//to print sum of all elements present in an array
import java.util.Scanner;
public class seventytwo{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{2,3,7,5,8,12};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of all element: "+sum);
    }}