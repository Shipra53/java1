//fins average of two integer number
import java.util.Scanner;
class fourteen{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer:");
        int a = input.nextInt();
        System.out.print("Enter second integer:");
        int b = input.nextInt();
        int c = (a+b)/2;
        System.out.println("average="+c);
    }
        
    }