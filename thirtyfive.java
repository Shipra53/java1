// check and print whether the entered character is capital,small alphabet,digit
import java.util.Scanner;
 class thirtyfive{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a charcter:");
        char ch=obj.next().charAt(0);
        if( ch >= 65 && ch <= 96 )
       System.out.println("capital alphabet");
       else if( ch >= 97 && ch <= 122)
       System.out.println("Small alphabet");
       else if ( ch >=48 && ch <= 57)
       System.out.println("digit");
    }
    }
