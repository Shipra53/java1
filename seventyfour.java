//to sort the elements of an array in ascending order
import java.util.Scanner;
public class seventyfour{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a={2,3,7,5,8,12};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted array in ascending order:");
        for(int i=0;i<a.length;i++){
    System.out.println(a[i]+ "");}
    }}