//write a value-returning method,is Vowel that returns the value if a given
//character is a vowel,and otherwise returns false.In main()method accepts 
//string from user and count number of vowels in that string.
import java.util.Scanner;
class ninetyfive{
    public static void main(String[]args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String st=input.nextLine();
    int count=0;
    for(int i=0;i<st.length();i++){
        if(isVowel(st.charAt(i))){
            count++;
        }
    }
    System.out.println("NUMBER OF VOWELS: "+count);
    }
    public static boolean isVowel(char letter){
        switch(letter){
            case'a':
            case'A':
            case'e':
            case'E':
            case'i':
            case'I':
            case'o':
            case'O':
            case'u':
            case'U':
            return true;
            default:
            return false;
        }
    }
} 