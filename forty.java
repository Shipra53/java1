//check code is male or female using switch case
import java.util.Scanner;
class forty{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the gender code in character : ");
        char a = input.nextLine().charAt(0); 
        String shi = " ";
        switch(a)
        {
            case 'M','m':
            shi = "code is male";
            break;
            case 'F','f':
            shi = "code is female";
            break;
            default:
            System.out.println("wrong");

        }
        System.out.println(shi);

    }
}
