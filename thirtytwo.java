//calculate average of three sujects and print the division
import java.util.Scanner;
 class thirtytwo{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the marks of first subject:");
        int first=obj.nextInt();
        System.out.println("Enter the marks of second subject:");
        int second=obj.nextInt();
        System.out.println("Enter the marks of third subject");
        int third=obj.nextInt();
        double average=(first+second+third)/3;
        if( average >= 60 )
       System.out.println("first division");
       else if( average >= 45 && average < 60)
       System.out.println("Second division");
       else if ( average >= 33 && average < 45)
       System.out.println("Third division");
       else 
       System.out.println("FAIL");
        }
      }