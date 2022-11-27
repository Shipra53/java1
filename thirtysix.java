// if age is 18 or more print you are minor otherwise you are adult
//using conditional operator[?:]
import java.util.Scanner;
 class thirtysix{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the age of a person:");
        int a=obj.nextInt();
        String str;
        str = (a>=18)?"YOU ARE ADULT":"YOU ARE MINOR";
        System.out.println(str);
    }
}   