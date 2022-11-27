//Find whether a year entered by user is a leap year or not.
import java.util.Scanner;
class fortyseven{
    public static void main(String[]args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number = ");
    int a = input.nextInt();
    if(a%4==0)
    {
        System.out.println("LEAP YEAR");
    }
    else{
        System.out.println("NOT a LEAP YEAR");
    }}}