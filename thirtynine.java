//enter any integer from 1 to 3 and print in word 
import java.util.Scanner;
class thirtynine{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer from 1-3 :");
        int a=input.nextInt();
        if(a==1)
        System.out.println(+a+" = one");
        else if(a==2)
        System.out.println(+a+" = two");
        else if(a==3)
        System.out.println(+a+ " = three");
        else 
        System.out.println("wrong entered");
                           
    }
}
