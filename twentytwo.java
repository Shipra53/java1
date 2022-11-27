//calculate average
//print pass and fail
import java.util.Scanner;
class twentytwo {
 public static void main(String[]args) 
 {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the marks of first subject=");
    int a=obj.nextInt();
    System.out.println("Enter the marks of second subject=");
    int b=obj.nextInt();
    System.out.println("Enter the marks of third subject=");
    int c=obj.nextInt();
    double average = (a+b+c)/3;
    System.out.println("Average:"+average);
    if (average>=33)
    System.out.println("PASS");
    else
    System.out.println("FAIL");
 }  
}
    
