//calculate and print its commision
//sales upto 2500,commision is 5% of sale otherwise it is & 7% of sales 
import java.util.Scanner;
class thirtyeight{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales");
        int a=input.nextInt();
        double commission = (a<=2500)?(a*5)/100:(a*7)/100;
        System.out.println(commission);
                           
    }
}
