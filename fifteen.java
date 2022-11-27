//find sum and average
import java.util.Scanner;
class fifteen{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer:");
        int a = input.nextInt();
        System.out.print("Enter second integer:");
        int b = input.nextInt();
        int c = a+b;
        float d = c/2;
        System.out.println("SUM: "+c);
        System.out.println("AVEARGE: "+d);
    }
        
    }