/*enter two integer then perform following calculations
 1-addition
 2-subtraction
 3-multiplication
 4-division
 5-mod
 */
import java.util.Scanner;
class twenty{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer:");
        int a = input.nextInt();
        System.out.print("Enter second integer:");
        int b = input.nextInt();
        System.out.println("enter two enteger" +a+"&"+b);
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println(+a+"+"+b+"="+c);
        System.out.println(+a+"="+b+"="+d);
        System.out.println(+a+"*"+b+"="+e);
        System.out.println(+a+"/"+b+"="+f);
        System.out.println(+a+"%"+b+"="+g);
    }
        
    }