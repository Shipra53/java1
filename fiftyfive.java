//find out whether the given integer is present in array 
import java.util.Scanner;
public class fiftyfive{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
            int [] a={2,4,6,8};
           System.out.print("Enter any integer: ");
             int num=input.nextInt(); 
             for(int i = 0; i<a.length; i++){
                if(num == a[i])
                    System.out.println(+num+" is present in an array");

                
    }
}}