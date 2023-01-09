//remove dublicate element in an array 
import java.util.Scanner;
public class eightyone{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a={2,2,5,5,8,12,8,7};
        int count=0;
        System.out.println("ARRAY ELEMENTS AFTER REMOVING DUPLICATE ELEMENTS:");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }}
            if(count==0){
        System.out.print(a[i]+" ");
    }
count=0;
}}}


    