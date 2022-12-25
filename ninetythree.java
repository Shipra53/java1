//write a program with a method named getTotal that accepts two integers as an
//argument and return its sum.Call this method from main() and print the result 
import java.util.Scanner;
class ninetythree{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a=input.nextInt();
        System.out.print("Enter second integer: ");
        int b=input.nextInt();
        int sum = getTotal(a,b);
        System.out.println("SUM: "+sum);
    }
    public static int getTotal(int num1, int num2){
        return num1 + num2;
    }
}