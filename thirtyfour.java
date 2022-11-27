//enter any character and print its ASCII value
import java.util.Scanner;
 class thirtyfour{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=obj.next().charAt(0);
        int asciiValue=ch;
        System.out.println("ASCII value of "+ch+" is "+asciiValue);

        }
      }