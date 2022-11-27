//check and print the given integer is even or odd
import java.util.Scanner;
class twentythree {
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter any integer:");
        int integer = input.nextInt();
        if(integer % 2 ==0)
        {
        System.out.println(+integer +"  IS EVEN NUMBER");
        }
        else
        {
        System.out.println(+integer +"  IS ODD NUMBER");
        }
        
    }
        
    }
