//print write code if entered code is from 5 to 24 otherwise wrong code
import java.util.Scanner;
 class thirty {
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the code in integer");
        int  a=obj.nextInt();
        if(a>=5 && a<=24)
        System.out.println("ENTERED CODE IS RIGHT");
        else
        System.out.println("ENTERED CODE IS WRONG");
        }
      }
