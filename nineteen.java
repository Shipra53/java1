//find simple interest
import java.util.Scanner;
class nineteen{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the Principal:");
        float p = input.nextFloat();
        System.out.println("Enter the Rate of interest:");
        float r = input.nextFloat();
        System.out.println("Enter the Time:");
        float t = input.nextFloat();
        float siminterest = (p*r*t)/100f;
        System.out.println("SIMPLE INTEREST: "+siminterest);
    }
        
    }