//find out the day of the week
import java.util.Scanner;
class fortysix{
    public static void main(String[]args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number = ");
    int a = input.nextInt();
    switch (a){
        case 1 : System.out.println("MONDAY");
        break;
        case 2 : System.out.println("TUESDAY");
        break;
        case 3 : System.out.println("WEDNESDAY");
        case 4 : System.out.println("THURSDAY");
        break;
        case 5 : System.out.println("FRIDAY");
        break;
        case 6 : System.out.println("SATURDAY");
        break;
        case 7 : System.out.println("SUNDAY");
        break;
        default:
        System.out.println("WRONG NUMBER");

    }}}
