//to print the largest elements in an array
import java.util.Scanner;
public class sixtynine{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{2,3,7,5,8,12,4};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
            max=a[i];
        }
        System.out.print("Largest element in given array: "+max);
    }}
