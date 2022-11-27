//calculate and print its commision
//sales upto 2500,commision is 5% of sale otherwise it is & 7% of sales 
import java.util.Scanner;
class twentyfive{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales");
        int a=input.nextInt();
        double commission1 =(a*5)/100;
        double commission2 =(a*7)/100;
        if(a<=2500)
        System.out.println("commission="+commission1+"RS");
        else
        System.out.println("commission="+commission2+"RS");
                           
    }
}
