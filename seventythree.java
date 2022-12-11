//to right rotate the elements of an array
import java.util.Scanner;
public class seventythree{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a={2,3,7,5,8,12};
        int n=4;
        for(int i=0;i<n;i++){
            int j,last;
            last=a[a.length-1];
        for(j=a.length-1;j>0;j--){
        a[j]=a[j-1];
        }
        a[0]=last;
        }
            System.out.println();
            System.out.println("After right rotation:");
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]+ "");
            }
        }}