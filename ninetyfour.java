//write a method named isEven that accepts an int argumrnt.
//the method should return true if the argument is even,or false otherwise
//Also write a program to test your method.
import java.util.Scanner;
class ninetyfour{
 public static void main(String[]args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter any integer:");
    int integer = input.nextInt();
    if(isEven(integer))
    {
    System.out.println(+integer +" IS EVEN NUMBER");
    }
    else
    {
    System.out.println(+integer +" IS ODD NUMBER");
    }}
    public static boolean isEven(int number) {
        if(number % 2 ==0){
            return true;
        }
        else{
            return false;
        }
    }}