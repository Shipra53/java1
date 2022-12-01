//to left rotate the elements of an array
import java.util.Scanner;
public class sixtythree{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{3,6,9,12,15};
        int n=3;
        for(int i=0;i<n;i++)
        {
        int j,first;
        first=a[0];
        for(j=0;j<a.length-1;j++){
            a[j]=a[j+1];
        }
        a[j]=first;
        }
        System.out.println("After left rotation:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }}}