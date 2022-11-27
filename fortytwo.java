//enter any positive number and print it.the program should be keep on 
//asking the number again until user do not enter any negative number.
import java.util.Scanner;
 class fortytwo{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int fterm=0,sterm=1; 
        System.out.print("Enter the number of term : ");
        int a=input.nextInt();
        for(int i=1; i<=a; i++){
            System.out.print(fterm+ ", ");
            int nextTerm=fterm+sterm;
            fterm=sterm; 
           sterm=nextTerm;
               }
        }
}