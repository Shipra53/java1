//calculate and print its commision
//if sales upto 25000 commision is 5% of sales,if sales is from 25001 to 50000 commission is 7% of sales
//if sales is from 50001 to 75000 commission is 8% of sales
//otherwise it is & 10% of sales 
import java.util.Scanner;
class thirtythree{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales");
        int a=input.nextInt(); 
        float commission1=(a*5)/100;
        float commission2=(a*7)/100;
        float commission3=(a*8)/100;
        float commission4=(a*10)/100;
        if(a<=25000)
        System.out.println("commission="+commission1+"RS");
        else if(a>=25001 && a<=50000)
        System.out.println("commission="+commission2+"RS");
        else if(a>=50001 && a<=75000)
        System.out.println("commission="+commission3+"RS");
        else 
        System.out.println("commission="+commission4+"RS");  
                                   
    }
}
