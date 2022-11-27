/*enter two integer number then check and print how many times the first integer
 can be divided by second integer and what will be left
 */
import java.util.Scanner;
class eighteen{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer:");
        int a = input.nextInt();
        System.out.print("Enter second integer:");
        int b = input.nextInt();
        int c = a/b;
        int d = a%b;
        System.out.println("Quotient = "+c);
        System.out.println("remainder = "+d);
    }
        
    }