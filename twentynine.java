//if entered code is 5,7,11 or 24 then print right code otherwise print wrong code
import java.util.Scanner;
 class twentynine{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter code:");
        int code= obj.nextInt();
        if(code == 5|| code == 7|| code == 11 || code == 24)
        System.out.println("RIGHT CODE");
        else
        System.out.println("WRONG CODE");
        
    }
    
}
