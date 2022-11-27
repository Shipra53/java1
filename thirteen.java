//fins sum and print as __+__=?ss
import java.util.Scanner;
class thirteen{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer:");
        int a = input.nextInt();
        System.out.print("Enter second integer:");
        int b = input.nextInt();
        int c = a+b;
        System.out.println(+a+"+"+b+"="+c);
    }
        
    }