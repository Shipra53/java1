// find cube if less than five
// find square if greater than aur equal to 5
import java.util.Scanner;
class twentyfour {
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter any integer:");
        int integer = input.nextInt();
        if(integer<5)
        { 
        System.out.println("CUBE OF GIVEN NUMBER IS=  "+(integer*integer*integer));
        }
        else
        {
        System.out.println("SQUARE OF GIVEN NUMBER IS=  "+(integer*integer));
        }
        
    }
        
    }
