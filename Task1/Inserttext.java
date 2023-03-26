package Task1;
import java.util.Scanner;
public class Inserttext {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Your First Text : ");
        String text1 = x.nextLine();
        System.out.print("Enter Your Second Text : ");
        String text2 = x.nextLine();
        int temp=text1.length()/2;
        String text3=text1.substring(0,temp)+text2+text1.substring(temp);
        System.out.print( "text : " +text3);
    }
}