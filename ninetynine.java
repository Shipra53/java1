//write a java method to print the multiplication table of a number n.
import java.util.Scanner;
class ninetynine{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int n=input.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+" * "+i+" = "+(n*i));
    }}