//to print the smallest element in an array
import java.util.Scanner;
public class seventy{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{2,3,7,5,8,12};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<max)
            max=a[i];
        }
        System.out.print("Smallest element in given array: "+max);
    }}