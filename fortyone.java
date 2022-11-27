//enter any positive number and print it.the program should be keep on 
//asking the number again until user do not enter any negative number.
import java.util.Scanner;
public class fortyone{
    public static void main(String[]args){
       int a;
        do{
         Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        a=input.nextInt();
        if(a<0)
        {
            System.out.println("number is negative");
        
            continue;
            }
     }
      while(a>=0);
    }
}