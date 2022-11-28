//calculate the average marks from an array containing marks of all students in
//physics using for each loop.
import java.util.Scanner;
public class fiftysix{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
            int [] marks_physics={72,74,86,88};
            int sum=0;
            for(int element:marks_physics){
               sum=sum+element;
            }
            float average=sum/4;
            System.out.println("average marks= "+average);
        }}