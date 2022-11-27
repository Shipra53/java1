/*print pass and fail */
import java.util.Scanner;
class fortyfour{
    public static void main(String[]args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the marks of 1st subject= ");
    int a = input.nextInt();
    System.out.println("Enter the marks of 2nd subject= ");
    int b = input.nextInt();
    System.out.println("Enter the marks of 3rd subject= ");
    int c = input.nextInt();
    float avg = (a+b+c)/3f;
    if(avg>=40 && a>=33 && b>=33 && c>=33)
    {
        System.out.println("PASS");
    }
    else{
        System.out.println("FAIL");
    }
    }
}