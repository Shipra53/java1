//print odd and even number from an array
public class eightythree{
    public static void main(String[]args) {
        int [] a=new int[]{2,1,3,9,4,6,6,11};
        System.out.println("ODD NUMBERS: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }}
            System.out.println("EVEN NUMBERS");
            for(int i=0;i<a.length;i++){
                if( a[i]%2==0)
                System.out.println(a[i]);
            }
        }}