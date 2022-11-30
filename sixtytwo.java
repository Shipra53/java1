//to find the frequency of each element in the array
import java.util.Scanner;
public class sixtytwo{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int [] a=new int[]{3,4,3,7,6,6,5,8};
        int [] freq=new int [a.length];
        int b=-1;
        for(int i=0;i<a.length;i++){
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    freq[j]=b;
                }
            }
            if(freq[i]!=b)
            freq[i]=count;
        }
        for(int i=0;i<freq.length;i++)
        if(freq[i]!=b)
        System.out.println(" "+a[i]+ "=" +freq[i]);
    }}