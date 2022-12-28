// write recursive function to calculate the sum of first n natural numbers 
import java.util.Scanner;
class one_hundred_one{
    public static void main(String[]args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num=input.nextInt();
       int sum=sumofnumbers(num);
       System.out.println("SUM: "+sum);
    }
    public static int sumofnumbers(int num) {
        if(num!=0)
        return num+sumofnumbers(num-1);
        else
        return num;
    }}