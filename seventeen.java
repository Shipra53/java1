//calculate and print area of circle
import java.util.Scanner;
class seventeen{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print(" Enter the radius:");
        int r = input.nextInt();
        double area = 3.14*(r*r);
        System.out.println("Area of circle = "+area);
    }
        
    }