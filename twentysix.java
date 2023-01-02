//enter the words to be send by telegram that calculate the print 
//telegram charge acc. to following rules
//uto 10 wors,total charge is Rs7.5,for each extra word,the charge is Rs 1.5 per word extra.
import java.util.Scanner;
class twentysix{
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=input.nextLine();
        String []words=str.split(" ");
        int len=words.length;
        System.out.println("Total words="+len);
        float charge=7.5f;
        if(len>10){
            charge+=((len-10)*1.5);
        System.out.println("Total charges= "+charge);}
        else
        {System.out.println("Total charges= "+charge);
}}}