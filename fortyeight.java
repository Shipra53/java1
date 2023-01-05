//to find out the type of website from the URL:
//.com-commercial website
//.org-organizational website
//.in-indian website
import java.util.Scanner;
class fortyeight{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a website: ");
    String web=input.next();
    if(web.endsWith(".com")){
    System.out.println("THIS WEBSITE IS A COMMERCIAL WEBSITE");
    }
    else if(web.endsWith(".org")){
        System.out.println("THIS WEBSITE IS AN ORGANIZATIONAL WEBSITE");
    }
    else if(web.endsWith(".in")){
        System.out.println("THIS WEBSITE IS AN INDIAN WEBSITE");
    }
    }}