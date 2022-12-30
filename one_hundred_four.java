//write a function to find the average of a set of numbers passed as arguments.
import java.util.Scanner;
class one_hundred_four{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        double sum=0;
        System.out.print("Enter the number of terms: ");
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the "+n+" numbers: ");
        for(int i=0;i<n;i++)
        a[i]=input.nextInt();
        for(int i=0;i<n;i++)
        sum=sum+a[i];
    System.out.println("AVERAGE:"+(sum/n));
    }}
