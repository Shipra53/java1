//print adult or minor
import java.util.*;
 class twentyone{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the age of person:");
        int a=obj.nextInt();
        if (a>=18)
        System.out.println("you are adult");
        else
        System.out.println("you are minor");

    }
    
}
