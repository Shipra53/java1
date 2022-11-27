//covert a string to lowercase
import java.util.*;
public class fortynine{
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String Sc = in.nextLine();
        Sc = Sc.toLowerCase();
        System.out.println(Sc);
    }
}