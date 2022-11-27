//check and print whether the given integer is odd or even number
//using conditional operator[? :]
import java.util.Scanner;
class thirtyseven{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer");
        int a=input.nextInt();
        String str;
        str = (a%2==0)?"EVEN":"ODD";
        System.out.println(str);                       
    }
}
