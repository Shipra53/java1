//to find maximum element in an java array
import java.util.Scanner;
public class fiftynine{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
            System.out.println("Enter the array element:");
            int a=input.nextInt();
            int arr[]=new int[a];
            int max=arr[0];
            System.out.println("Enter the array element: ");
            for(int i=0;i<a;i++)
          {
            arr[i]=input.nextInt();
          }
          for(int i=0;i<a;i++)
          {
            if(arr[i]>max)
            max=arr[i];
          }
          System.out.println("Largest element present in given array="+max);
        }}