//enter any integer and reverse the integer and print it
//after reversal the number is same as old number otherwise prints not same
import java.util.Scanner;
public class fortythree{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer");
        int a=input.nextInt();
        int remainder,reversed=0; 
        for(;a!=0;a/=10){
           remainder =a%10;
         reversed = reversed*10+remainder;
        }
        if( a == reversed )
        {
        System.out.println(" reversed number = "+reversed);
        }
        else
        { 
        System.out.println("reversed number is not same ");
        }
    }   
}
