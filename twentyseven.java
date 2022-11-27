//check and print,whether the given integer is positive,negative or zero
import java.util.Scanner;
class twentyseven {
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter any integer:");
        int integer = input.nextInt();
        if(integer > 0)
        {
        System.out.println(+integer+  " IS POSITIVE NUMBER");
        }
        else if(integer < 0)
        {
        System.out.println(+integer+  " IS NEGATIVE NUMBER");
        }
        else  
        {
            System.out.println(+integer+ "  IS zero");
        }
        
    }
        
    }