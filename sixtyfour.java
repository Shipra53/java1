//to print the duolicate elements of an array
public class sixtyfour{
    public static void main(String[]args) {
        int [] a=new int[]{2,4,3,2,4,6,6,8};
        System.out.println("Duplicate elements of given array: ");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if( a[i] == a[j])
                System.out.println(a[j]);
            }
        }}}