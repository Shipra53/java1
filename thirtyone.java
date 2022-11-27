//eligible for scholarship or not
import java.util.Scanner;
 class thirtyone{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the anual income:");
        int income=obj.nextInt();
        System.out.println("Enter the age:");
        int age=obj.nextInt();
        if((income>=100000 && income<=200000) && (age>=18 && age<=24))
        System.out.println("ELIGIBLE FOR SCHOLARSHIP");
        else
        System.out.println("NOT ELIGIBLE FOR SCHOLARSHIP");
        }
      }