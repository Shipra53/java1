//check and print the given data is male or female
import java.util.Scanner;
 class twentyeight{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter code:");
        char ch= obj.nextLine().charAt(0);
        if(ch == 'M'|| ch == 'm')
        System.out.println("GIVEN DATA IS MALE");
        else if(ch == 'F'|| ch == 'f')
        System.out.println("GIVEN DATA IS FEMALE");
        else
        System.out.println("ENTERED CODE IS WRONG");
    }
    
}
