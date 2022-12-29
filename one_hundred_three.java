//write a function to print the nth term of fibonacci series using recursion
import java.util.Scanner;
class one_hundred_three{
    public static void main(String[]args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the no. of terms: ");
       int n=input.nextInt();
       for(int i=0;i<n;i++){
        System.out.print(series(i)+" ");
       }}
      public static int series(int num){
        if(num<2)
        return num;
        return series(num-1)+series(num-2);
      }}